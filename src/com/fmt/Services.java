package com.fmt;



/**
 * @author oliviamuenster marywaller
 * 
 * Created a class to hold the data for the services. 
 *
 */
public class Services {

	
	protected Item services;
	protected String serviceName; 
	protected double hourlyRate;
	public Item getServices() {
		return services;
	}
	public String getUnit() {
		return serviceName;
	}
	public double getUnitPrice() {
		return hourlyRate;
	}
	public Services(Item services, String unit, double unitPrice) {
		super();
		this.services = services;
		this.serviceName = serviceName;
		this.hourlyRate = hourlyRate;
	}
	
}
