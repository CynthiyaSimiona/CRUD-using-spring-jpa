package com.SalesOrder.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="customer")
public class Customer {
	
	public List<SalesOrder> getSalesOrder() {
		return salesOrder;
	}

	public void setSalesOrder(List<SalesOrder> salesOrder) {
		this.salesOrder = salesOrder;
	}

	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	@NotNull
	private String phone;
	
	
	@OneToMany(mappedBy="customer",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<SalesOrder> salesOrder;

	public int getId() {
		
		return id;
	}

	public void setId(int id) {
		
		this.id = id;
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}

	public String getPhone() {
		
		return phone;
	}

	public void setPhone(String phone) {
		
		this.phone = phone;
	}
	
	
	

}
