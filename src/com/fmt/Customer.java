package com.fmt;
import java.util.List;

/**
 * @author oliviamuenster marywaller
 * 
 * Created a class to hold the data for the customers.
 *
 */
public abstract class Customer  {
	
	public Customer(String personalID, Person customer, Address address, List<String> email) {
		
		this.personalID = personalID;
	}
	
	private String personalID;
	private Person customer; 
	private Address address;
	private String email;

	public String getPersonalID() {
		return personalID;
	}
	
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