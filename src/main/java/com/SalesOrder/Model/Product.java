package com.SalesOrder.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue
	private String pcode;
	
	private String pname;
	
	private String description;
	
	private String price;
	
	@OneToMany(mappedBy="product",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private List<SalesOrder> salesOrder;

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		
		this.pcode = pcode;
	}

	public String getPname() {
		
		return pname;
	}

	public void setPname(String pname) {
		
		this.pname = pname;
	}

	public String getDescription() {
		
		return description;
	}

	public void setDescription(String description) {
		
		this.description = description;
	}

	public String getPrice() {
		
		return price;
	}

	public void setPrice(String price) {
		
		this.price = price;
	}

	public List<SalesOrder> getSalesOrder() {
		
		return salesOrder;
	}

	public void setSalesOrder(List<SalesOrder> salesOrder) {
		
		this.salesOrder = salesOrder;
	}

}
