package com.fmt;

/**
 * @author oliviamuenster marywaller
 * 
 * 2023-02-24
 * 
 * Creating a class to hold the values of Address.
 *
 */
public class Address {
	protected String street;
	protected String city;
	protected String state;
	protected String zip;
	protected String country;


	public String getStreet() {
		return street;
	}
	public Address(String street, String city, String state, String zip, String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}
	public String getCountry() {
		return country;
	}
}