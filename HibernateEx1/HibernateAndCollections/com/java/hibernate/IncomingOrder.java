package com.java.hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IncomingOrder {
	
	@Column(name = "Product_Name", nullable = false) 
	private String nameOfProduct;
	@Column(name = "Product_Quantity", nullable = false) 
	private int quantity;
	@Column(name = "Customers_Address", nullable = false) 
	private String address;
	@Column(name = "Customers_Phone", nullable = false) 
	private String phoneN;
	
	
	public String getNameOfProduct() {
		return nameOfProduct;
	}
	public void setNameOfProduct(String nameOfProduct) {
		this.nameOfProduct = nameOfProduct;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneN() {
		return phoneN;
	}
	public void setPhoneN(String phoneN) {
		this.phoneN = phoneN;
	}
	@Override
	public String toString() {
		return "Product = " + getNameOfProduct() +"\n" + " Quantity = " + getQuantity()+ "\n"
				+ " Address = " + getAddress()+ "\n" + " Phone Number = " + getPhoneN() + "\n";
	}
	
	

}
