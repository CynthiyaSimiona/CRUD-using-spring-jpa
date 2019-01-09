package com.Crud.springhibernate;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
	
	List<Employee> findAll();
	Object findById(int id);
	

}
