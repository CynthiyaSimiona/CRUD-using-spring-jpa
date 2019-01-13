package com.SalesOrder.MainApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.SalesOrder.Controller","com.SalesOrder.ServiceImpl"})
@EntityScan({"com.SalesOrder.Model.Customer","com.SalesOrder.Model.Product","com.SalesOrder.Model.SalesOrder"})
@EnableJpaRepositories({"com.SalesOrder.Repository.CustomerRepository","com.SalesOrder.Repository.ProductRepository","com.SalesOrder.Repository.SalesOrderRepository"})
public class MainAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainAppApplication.class, args);
		
		
	}

}

