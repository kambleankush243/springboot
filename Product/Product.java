package com.hibernateTask.Product;

import com.hibernateTask.Product.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	int product_id;
	String product_name;
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_type=" + product_type
				+ "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int product_id, String product_name, String product_type) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_type = product_type;
	}
	String product_type;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_type() {
		return product_type;
	}
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}
}

