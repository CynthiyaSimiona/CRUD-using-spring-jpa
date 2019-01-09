package com.Crud.springhibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	private int emp_id;
	
	private String emp_name;
	private int emp_age;
	
	
	
	public Employee() {   }
	public Employee(int emp_id,String name,int age) {
		this.setEmp_id(emp_id);
	this.setEmp_name(name);
	this.setEmp_age(age);
		
	}
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getEmp_age() {
		return emp_age;
	}
	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}
	
	@Override
    public String toString() {
        return "Employee{" +
                "Empid=" + emp_id +
                ", EmpName='" + emp_name + '\'' +
                ", EmpAge='" + emp_age + '\'' +
                '}';
    }
	
	
}