package com.fmt;
/**
 * @author oliviamuenster marywaller
 * 
 * 2023-03-11
 * 
 * Created a class to hold the data for the services. 
 *
 */
public class Services extends Item{
	
	
	// new constructor
	
	
	public Services(String code, String name, Item services, double hourlyRate) {
		super(code, name);
		this.services = services; 
		this.hourlyRate = hourlyRate; 
	}
	protected Item services;
	protected double hourlyRate;
	protected double hoursWorked;
	
	public Item getServices() {
		return services;
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}
	public double getTotalCost() {
		double totalCost = this.hourlyRate * this.hoursWorked;
		return totalCost;
	}
	public double getTax() {
		double taxAmount = this.getTotalCost() * 0.0345;
		return taxAmount;
	}
	public double getTaxedCost() {
		double amountDue = this.getTax() + this.getTotalCost();
		return amountDue;
	}

	@Override
	public String toString() {
		return null;
	}
}