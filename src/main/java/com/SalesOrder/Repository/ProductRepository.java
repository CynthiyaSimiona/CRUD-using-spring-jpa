package com.SalesOrder.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SalesOrder.Model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,String> {

}
