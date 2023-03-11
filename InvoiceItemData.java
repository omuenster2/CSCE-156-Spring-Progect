package com.fmt;

import java.util.List;

public class InvoiceItemData {
	protected String invoiceCode;
	protected String itemCode;
	protected String identifier;
	protected List<String> items;
	
		public List<String> getItems() {
		return items;
	}
		public String getInvoiceCode() {
			return invoiceCode;
		}
		public String getItemCode() {
			return itemCode;
		}
		public String getIdentifier() {
			return identifier;
		}
		public InvoiceItemData(String invoiceCode, String itemCode, String identifier, List<String> items) {
			super();
			this.invoiceCode = invoiceCode;
			this.itemCode = itemCode;
			this.identifier = identifier;
			this.items = items;
		}
	}