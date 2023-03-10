package com.fmt;

public class InvoiceDataFile {
	protected String invoiceData;
	protected String storeCode;
	protected String customerCode;
	protected String salesPerson;
	protected String incoiveData;
	
	public InvoiceDataFile(String invoiceData, String storeCode, String customerCode, String salesPerson,
			String incoiveData) {
		super();
		this.invoiceData = invoiceData;
		this.storeCode = storeCode;
		this.customerCode = customerCode;
		this.salesPerson = salesPerson;
		this.incoiveData = incoiveData;
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
		return incoiveData;
	}
}