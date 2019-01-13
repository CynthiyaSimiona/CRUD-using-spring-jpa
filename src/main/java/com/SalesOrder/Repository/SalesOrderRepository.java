package com.SalesOrder.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SalesOrder.Model.SalesOrder;

@Repository
public interface SalesOrderRepository extends CrudRepository<SalesOrder,String> {

}
