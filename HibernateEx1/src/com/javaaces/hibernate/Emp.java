package com.javaaces.hibernate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity  
@Table(name = "emp")
public class Emp implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	public Emp() {
	}
	@Id  
	@GeneratedValue(generator="system-assigned")
	@GenericGenerator(name="system-assigned", strategy = "assigned")
	@Column(name = "EMP_ID", unique = true, nullable = false)
	private int id;
	@Column(name = "NAME", nullable = false)
	private String name;
	@Column(name = "AGE", nullable = false)
	private int age;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street", column=@Column(name="Home_Street_Name")),
		@AttributeOverride(name="state", column=@Column(name="Home_State_Name")),
		@AttributeOverride(name="zip", column=@Column(name="Home_Zip_Name")),
		@AttributeOverride(name="email", column=@Column(name="Home_Email_Name"))	
	})
	private Address homeAddress; // Code above changes the column name to differentiate between home and office address 
	@Embedded
	private Address officeAddress;
	
	// Getters and setters below
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
