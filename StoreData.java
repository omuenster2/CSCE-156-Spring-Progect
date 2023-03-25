package com.fmt;
/**
 * @author oliviamuenster marywaler
 * 
 * Creating a class to hold the values of store data. 
 *
 */
public class StoreData {	
	
	protected String storeID;
	protected Person manager;
	protected Address address;

	
	public StoreData(String storeID, Person manager, Address address) {
		super();
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setStoreID(String storeID) {
		this.storeID = storeID;
	}

	public Person getManagerCode() {
		return manager;
	}
	
}
