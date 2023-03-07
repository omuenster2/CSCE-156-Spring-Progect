package com.fmt;



/**
 * @author oliviamuenster marywaller
 * 
 * Created a class that holds the data for the product class.
 *
 */
public class Product {
protected Item product;
protected String unit;
protected double unitPrice;

public Product( Item product, String unit, double unitPrice) {
	super();
	this.product = product;
	this.unit = unit;
	this.unitPrice = unitPrice;
}

public Item getProduct() {
	return product;
}

public String Unit() {
	return unit;
}

public double getUnitPrice() {
	return unitPrice;
}
}
