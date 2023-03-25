package com.fmt;

public class InvoiceItems {
	protected String invoiceCode;
	protected String itemCode;
	protected String itemType;
	protected String quantity; 
	protected String leaseStart; 
	protected String leasdeEnd;
	public String getInvoiceCode() {
		return invoiceCode;
	}
	public String getItemCode() {
		return itemCode;
	}
	public String getItemType() {
		return itemType;
	}
	public String getQuantity() {
		return quantity;
	}
	public String getLeaseStart() {
		return leaseStart;
	}
	public String getLeasdeEnd() {
		return leasdeEnd;
	}
	public InvoiceItems(String invoiceCode, String itemCode, String itemType, String quantity, String leaseStart,
			String leasdeEnd) {
		super();
		this.invoiceCode = invoiceCode;
		this.itemCode = itemCode;
		this.itemType = itemType;
		this.quantity = quantity;
		this.leaseStart = leaseStart;
		this.leasdeEnd = leasdeEnd;
	} 
}