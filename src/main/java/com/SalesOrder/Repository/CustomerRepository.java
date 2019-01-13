package com.SalesOrder.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SalesOrder.Model.Customer;


@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer>{
	
	

}
