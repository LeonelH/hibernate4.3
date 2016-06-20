package com.javaaces.hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

@Column(name = "STREET_NAME", nullable = false) // this shows that you can change the name of the column in address
private String street;
@Column(name = "STATE_NAME", nullable = false)
private String state;
@Column(name = "ZIP_NAME", nullable = false)
private String zip;
@Column(name = "EMAIL_NAME", nullable = false)
private String email;



public String getStreet() {
	return street;
}



public void setStreet(String street) {
	this.street = street;
}



public String getState() {
	return state;
}



public void setState(String state) {
	this.state = state;
}



public String getZip() {
	return zip;
}



public void setZip(String zip) {
	this.zip = zip;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



@Override
public String toString() {
	return "Street = " + getStreet() + ", State = " + getState() + ", Zip = " + getZip()
			+ ", Email = " + getEmail();
}

}
