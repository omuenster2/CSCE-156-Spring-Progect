//package com.fmt;
/**
 * @author oliviamuenster marywaler
 * 
 * 2023-03-11
 * 
 * Created Invocie as a class to hold values to make calculations 
 *
 */
package com.fmt;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

	protected String invoiceCode;
	protected String storeCode;
	protected String customerCode;
	protected String salesPerson;
	protected String invoiceDate;
	protected String itemCode;
	protected List<Item> items;
	
	

	public Invoice(String invoiceCode, String storeCode, String customerCode, String salesPerson, String invoiceDate,
			String itemCode, List<Item> items) {
		super();
		this.invoiceCode = invoiceCode;
		this.storeCode = storeCode;
		this.customerCode = customerCode;
		this.salesPerson = salesPerson;
		this.invoiceDate = invoiceDate;
		this.itemCode = itemCode;
		this.items = items;
	}

	public Invoice(String invoiceCode, String storeCode, String customerCode, String salesPerson, String invoiceDate) {
	}
	
	public String getInvoiceData() {
		return invoiceCode;
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
//// sorts the inputs of the invoices to be in alphanumeric order
//	public int compareTo(Invoice o) {
//		return this.getInvoiceData().compareTo(o.getInvoiceData());
//	}
}