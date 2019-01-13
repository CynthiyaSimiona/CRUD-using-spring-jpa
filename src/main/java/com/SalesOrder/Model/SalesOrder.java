package com.SalesOrder.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="salesorder")

public class SalesOrder {
	
	@Id
	@GeneratedValue
	private String orderid;
	
	private int quantity;
	
	private String totalprice;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="custid")
	private Customer customer;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pcode")
	private Product product;

	public String getOrderid() {
		
		return orderid;
	}

	public void setOrderid(String orderid) {
		
		this.orderid = orderid;
	}

	public int getQuantity() {
		
		return quantity;
	}

	public void setQuantity(int quantity) {
		
		this.quantity = quantity;
	}

	public String getTotalprice() {
		
		return totalprice;
	}

	public void setTotalprice(String totalprice) {
		
		this.totalprice = totalprice;
	}

	public Customer getCustomer() {
		
		return customer;
	}

	public void setCustomer(Customer customer) {
		
		this.customer = customer;
	}

	public Product getProduct() {
		
		return product;
	}

	public void setProduct(Product product) {
		
		this.product = product;
	}
	
	

}
