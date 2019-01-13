package com.SalesOrder.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SalesOrder.ServiceImpl.SalesServiceImpl;

@RestController
@RequestMapping("/sales")
public class SalesController {
	
	SalesServiceImpl salesServiceImpl;
	
	@GetMapping("/hello")
	public String Hello() {
		return salesServiceImpl.Hello();
	}
	
	

}
