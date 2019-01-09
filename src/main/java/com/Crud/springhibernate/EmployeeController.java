package com.Crud.springhibernate;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@RequestMapping(value="/hello",
			        method=RequestMethod.GET,
			        produces= {"application/JSON"})
	public String Hello() {
		return "Hello,Good Morning!";
	}
	
	
	@RequestMapping(value="/getall",
	        method=RequestMethod.GET,
	         produces= {"application/JSON"})
	
	public List<Employee> GetAll(){
		return employeeRepository.findAll();
	}
	
	
	@RequestMapping(value="/insert",
	        method=RequestMethod.POST,
	         consumes= {"application/JSON"})
	
	public String Insert(@RequestBody Employee employee){
		int id=employee.getEmp_id();
		String name=employee.getEmp_name();
		int age=employee.getEmp_age();
	if( employeeRepository.save( new Employee(id,name,age)) != null);
	 return "Row Insertion Successful";
	 
	 }
	
	
	@RequestMapping(value="/find/{id}",
	        method=RequestMethod.GET,
	         consumes= {"application/JSON"})
	
	public Object findById(@PathVariable(value="id") int id){
		
//		if(employeeRepository.findById(id) == null)
//			return "Employee with id\t" + id + "\t cannot be found";
//		else
		return employeeRepository.findById(id);
	 }
	
	
     @DeleteMapping("/delete/{id}")
	
    public String delete(@PathVariable(value="id") int id) throws EmptyResultDataAccessException{
        try {
       employeeRepository.deleteById(id);
       
        return "Employee details with id\t" + id + "\t deleted successfully";
    }
        
        catch(Exception e) {
        	return "Employee with Id\t" + id + "\t not found";
        }
	
	
	}
     
     
     
}
		
	
	
	
	


