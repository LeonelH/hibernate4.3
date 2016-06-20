package com.java.hibernate;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name = "Orders")
public class Orders implements java.io.Serializable {

	private static final long serialVersionUID = 3L;

	public Orders() {		
	
	}
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="Order_ID", unique = true, nullable = false)
	private int id;
	@Column(name = "NAME", nullable = false)
	private String name;
	@Column(name = "PHONENUMBER", nullable = false)
	private String phoneNumber;
	@Column(name = "EMAIL", nullable = false)
	private String email;
	@ElementCollection
	@JoinTable(name="Order_List",
	joinColumns=@JoinColumn(name="Order_Id"))
	private Set<IncomingOrder> listOfOrders = new HashSet<IncomingOrder>();

	
	public Set<IncomingOrder> getListOfOrders() {
		return listOfOrders;
	}
	public void setListOfOrders(Set<IncomingOrder> listOfOrders) {
		this.listOfOrders = listOfOrders;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setID(int id) {
		this.id = id;
	}
	public int getID() {
		return id;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
