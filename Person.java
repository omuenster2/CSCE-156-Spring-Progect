package com.fmt;

import java.util.List;

/**
 * @author oliviamuenster marywaller
 * 
 *  Created a name class to hold the shared value between store and person data.
 *
 */
public class Person extends Address{
	
protected String firstName;
protected String lastName;
protected Address address;
protected String iD;
protected List<String> email;


public Person(String street, String city, String state, String zip, String country, String firstName, String lastName, Address address, String iD, List<String> email) {
	super(street, city, state, zip, country);
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
	this.iD = iD;
	this.email = email;
}
public List<String> getEmail() {
	return email;
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public Address getAddress() {
	return address;
}
public String getiD() {
	return iD;
}
}
