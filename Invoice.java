//package com.fmt;
/**
 * @author oliviamuenster marywaler
 * 
 * 2023-24-02
 * 
 * Created an interface to hold the total amount due depending on the customers data and what services they used.
 *
 */
	package com.fmt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Invoice {
	
	protected String invoiceData;
	protected String storeCode;
	protected String customerCode;
	protected String salesPerson;
	protected String invoiceDate;
	protected String invoiceCode;
	protected String itemCode;
	protected int quantityPurchased;
	protected double price;
	protected double fee;
	protected String startDate;
	protected String endDate;
	protected double hoursBilled;

	public Invoice(String invoiceData, String storeCode, String customerCode, String salesPerson, String invoiceDate,
			String invoiceCode, String itemCode, int quantityPurchased, double price, double fee, String startDate,
			String endDate, double hoursBilled) {
		super();
		this.invoiceData = invoiceData;
		this.storeCode = storeCode;
		this.customerCode = customerCode;
		this.salesPerson = salesPerson;
		this.invoiceDate = invoiceDate;
		this.invoiceCode = invoiceCode;
		this.itemCode = itemCode;
		this.quantityPurchased = quantityPurchased;
		this.price = price;
		this.fee = fee;
		this.startDate = startDate;
		this.endDate = endDate;
		this.hoursBilled = hoursBilled;
	}
	public String getInvoiceData() {
		return invoiceData;
	}
	public String getStoreCode() {
		return storeCode;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public String getSalesPerson() {
		return salesPerson;
	}
	public String getIncoiveData() {
		return invoiceDate;
	}
	public String getInvoiceDate() {
		return invoiceDate;
	}
	public String getInvoiceCode() {
		return invoiceCode;
	}
	public String getItemCode() {
		return itemCode;
	}
	public int getQuantityPurchased() {
		return quantityPurchased;
	}
	public double getPrice() {
		return price;
	}
	public double getFee() {
		return fee;
	}
	public String getEndDate() {
		return endDate;
	}
	public double getHoursBilled() {
		return hoursBilled;
	}
	
	public int compareTo(Invoice o) {
		return this.getInvoiceCode().compareTo(o.getInvoiceCode());
	}
	public ArrayList<Integer> numberOfItems(){
		Map <Invoice, Integer> countMap = new HashMap<Invoice, Integer>();
		for(Invoice invoice1 : InvoiceInput.Invoice()) {
			int count = 0;
			for(Invoice invoice2 : InvoiceInput.Invoice()) {
				if(invoice1.invoiceCode.equals(invoice2.invoiceCode)) {
					count++;
				}
			}
		 countMap.put(invoice1,  count);
		}
		return new ArrayList<>(countMap.values());
	}
}