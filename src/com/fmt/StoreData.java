package com.fmt;



/**
 * @author oliviamuenster marywaler
 * 
 * Creating a class to hold the values of store data. 
 *
 */
public class StoreData implements Invoice{
	
	protected String storeCode;
	protected String manager;
	protected Address storeAddress;
	protected double amountDue;
	
	
	public StoreData(String storeCode, String manager, Address storeAddress, double amountDue) {
		super();
		this.storeCode = storeCode; 
		this.manager = manager;
		this.storeAddress = storeAddress;
	}

	public String getStoreCode() {
		return storeCode;
	}

	public String getManagerCode() {
		return manager;
	}

	public Address getStoreAddress() {
		return storeAddress;
	}

	public double getTotalDue() {
		return amountDue;
	}

}
