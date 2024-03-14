package com.sopra.DAOAssignment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FurnitureInventory {
	
	@Id
	int id;
	@Column(name = "brand_name")
	String brandName;
	@Column(name = "product_name")
	String productName;
	@Column(name = "product_price")
	double productPrice;
	@Column(name = "product_quantity")
	int productQuantity;
	
	
	
	
	public FurnitureInventory() {
		// TODO Auto-generated constructor stub
	}

	public FurnitureInventory(int id, String brandName, String productName, double productPrice, int productQuantity) {
		this.id = id;
		this.brandName = brandName;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	@Override
	public String toString() {
		return "FurnitureInventory [id=" + id + ", brandName=" + brandName + ", productName=" + productName
				+ ", productPrice=" + productPrice + ", productQuantity=" + productQuantity + "]";
	}
	
	

}
