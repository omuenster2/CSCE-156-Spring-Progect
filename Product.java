package com.fmt;
/**
 * @author oliviamuenster marywaller
 * 
 * Created a class that holds the data for the product class.
 *
 */
public class Product extends Item {
	protected String productCode;
	protected String unit;
	protected double unitPrice;

	
	
	// new constructor 
	public Item(Item i)
	
	public Product(String unit, double unitPrice) {
		super();
		this.unit = unit;
		this.unitPrice = unitPrice;
	}

	public String Unit() {
		return unit;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	@Override
	public double getTotalCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}