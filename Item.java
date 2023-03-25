package com.fmt;

import java.util.List;
/**
 * @author oliviamuenster marywaller
 * 
 * 2023-24-02
 * 
 * Created a class that will hold the shared data for all of the services that are offerers at FaMaRt. 
 * Created methods to get the cost of items- used in Equipment. 
 *
 */
public abstract class Item {
	protected String invoiceCode;
	protected String itemCode;
//	protected char type;
	protected String name;

	public String getCode() {
		return code;
	}
//
//	public char getType() {
//		return type;
//	}

	public String getName() {
		return name;
	}
	public Item(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	public abstract double getTotalCost();
	public abstract double getTax();
	public double getTaxedCost() {
		return this.getTotalCost() + this.getTax();
	}
	public abstract String toString();
}