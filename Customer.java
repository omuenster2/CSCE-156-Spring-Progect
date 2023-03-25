package com.fmt;
import java.util.List;

/**
 * @author oliviamuenster marywaller
 * 
 * 2023-03-11
 * 
 * Created a class to hold the data for the customers.
 *
 */
public abstract class Customer  {
	
	public Customer(Person customer, Address address, List<String> email) {
	}
	
	private Person customer; 
	private Address address;
	private String email;
	
	public Person getName() {
		return customer;
	}
	
	public Address getAddress() {
		return address;	
	}
	
	public String getEmail(){
		return email;
	}
}