package com.fmt;
/**
 * @author oliviamuenster marywaller
 * 
 * 2023-02-24
 * 
 * Created a class to hold the equipment data. Used methods created in Item to get the cost values. 
 *
 */
public class Equipment extends Item {
	
	protected String model;
	
	// new constructor 
	
	public Equipment(String code, String name, String model) {
		super(code, name);
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	@Override
	public double getTotalCost() {
		return 0;
	}

	@Override
	public double getTax() {
		return 0;
	}
	@Override
	public String toString() {
		return null;
	}
}