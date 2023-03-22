package com.fmt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author oliviamuenster marywaller 
 * 
 * 2023-02-24
 * 
 * Creating a data converter class to read in data from the respective files, tokenize them, and return a list that has each persons 
 * information. The struggles faced while reading in this data came from tokenizing the email's past the index of 7 and a new list to 
 * then add to the list of the customer.  
 *
 */
public class DataConverter {

	private static final String personalData = "data/Persons.csv";
	public static List<Customer> loadPersonsData() {
		List<Customer> customer = new ArrayList<>();
		File p = new File(personalData);
		String line = null;
		try {
			Scanner s = new Scanner(p);
			int numItems = Integer.parseInt(s.nextLine());
			for(int i = 0; i < numItems; i++) {
				line = s.nextLine();
				if(!line.trim().isEmpty()) {
					Address address = null;
					Person e = null;
					Person m = null;
					String tokens[] = line.split(",");
					String iD = tokens[0];
					String firstName = tokens[1];
					String lastName = tokens[2];
					String street = tokens[3];
					String city = tokens[4];
					String state = tokens[5];
					String zip = tokens[6];
					String country = tokens[7];

					List<String> email = new ArrayList<String>();

					if (tokens.length >= 8) {
						for(int j = 8; j < tokens.length;j++ ) {
							email.add(tokens[j]);
						}
					}
					Person person = new Person(tokens[1], tokens[2], address, iD, email);
				}
			}
			s.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

		Gson test = new GsonBuilder().setPrettyPrinting().create();
		test.toJson(customer);
		String prettyJson = test.toJson(customer);
		File w = new File("data/Persons.json");
		PrintWriter pw;
		try {
			pw = new PrintWriter(w);
			pw.println(prettyJson);
			pw.close();
		} catch (FileNotFoundException x) {
			x.printStackTrace();
		}
		return customer;
	}	
	private static final String invoiceData = "data/Items.csv";
	public static List<Item> loadInvoiceData() {
		List<Item> item = new ArrayList<>();
		File i = new File(invoiceData);
		try {
			Scanner s = new Scanner(i);
			int numLines = Integer.parseInt(s.nextLine());
			while (s.hasNextLine()) {
				String lines = s.nextLine();
				String tokens[] = lines.split(",");
				String code = tokens[0];
				if (!tokens[1].equals( null)) {
					if(tokens[1].equals("E")) {
						String name = tokens[2];
						String model = tokens[3];
					}
					if(tokens[1].equals("P")) {
						String product = tokens[2];
						String unit = tokens[3];
						int unitPrice = Integer.parseInt(tokens[4]);
					}
					if(tokens[1].equals("S")) {
						String serviceName = tokens[2];
						double hourlyRate = Double.parseDouble(tokens[3]);
					}	
				}
			}
			s.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		Gson test = new GsonBuilder().setPrettyPrinting().create();
		test.toJson(item);
		String prettyJson = test.toJson(item);
		File w = new File("data/Items.json");
		PrintWriter pw;
		try {
			pw = new PrintWriter(w);
			pw.println(prettyJson);
			pw.close();
		} catch (FileNotFoundException x) {
			x.printStackTrace();
		}
		return item;	
	}

	public static List<StoreData> loadStoreData() {
		final String storeData = "data/Stores.csv";
		List<StoreData> store = new ArrayList<>();
		File f = new File(storeData);
		try {
			Scanner s = new Scanner(f);
			int numLines = Integer.parseInt(s.nextLine());
			while (s.hasNextLine()) {
				String lines = s.nextLine();
				if(!lines.trim().isEmpty()) {
					String tokens[] = lines.split(",");
					String storeCode = tokens[0];
					String manager = tokens[1];
					Address address = new Address(tokens[2], tokens[3], tokens[4], tokens[5], tokens[6]);
				}
			}
			s.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		Gson test = new GsonBuilder().setPrettyPrinting().create();
		test.toJson(store);
		String prettyJson = test.toJson(store);
		File w = new File("data/Stores.json");
		PrintWriter pw;
		try {
			pw = new PrintWriter(w);
			pw.println(prettyJson);
			pw.close();
		} catch (FileNotFoundException x) {
			x.printStackTrace();
		}

		return store;
	}
	private static final String invoiceDataFile = "data/Invoices.csv";
	public static List<Invoice> invoiceData(){
		List<Invoice> invoiceData = new ArrayList<Invoice>();
		File f = new File(invoiceDataFile);
		Invoice invoice = null;
		String line = null;
		try {
			Scanner s = new Scanner(f);
			int numItems = Integer.parseInt(s.nextLine());
			for(int i = 0; i < numItems; i++) {
				line = s.nextLine();
				if (!line.trim().isEmpty()) {
					String tokens[] = line.split(",");
					String invoiceCode = tokens[0];
					String storeCode = tokens[1];
					String customerCode = tokens[2];
					String salesPerson = tokens[3];
					String invoiceDate = tokens[4];
					invoice = new Invoice(invoiceCode, storeCode, customerCode, salesPerson, invoiceDate);
				}
			} 
			s.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Gson test = new GsonBuilder().setPrettyPrinting().create();
		test.toJson(invoiceData);
		String prettyJson = test.toJson(invoiceData);
		File w = new File("data/Invoices.json");
		PrintWriter pw;
		try {
			pw = new PrintWriter(w);
			pw.println(prettyJson);
			pw.close();
		} catch (FileNotFoundException x) {
			x.printStackTrace();
		}
		return invoiceData;
	}
	public static String loadItems(){
		final String invoiceItems = "data/InvoiceItems.csv";
		List<Item> items= new ArrayList<>();
		String line = null;
		File f = new File(invoiceItems);
		try {
			Scanner s = new Scanner(invoiceItems);
			int numItems = Integer.parseInt(s.nextLine());
			for(int i = 0; i < numItems; i++) {
				line = s.nextLine();
				if(!line.trim().trim().isEmpty()) {
					Item item = null; 
					String tokens[] = line.split(",");
					String invoiceCode3 = tokens[0];
					String itemCode = tokens[1];
					if (tokens[2] != "P" || tokens[2] != "L") {
						String quantity = tokens [2];
					} 
					else if (tokens[2] == "L") {
						String itemType = tokens[3];
						String leaseStart = tokens[5];
						String leaseEnd = tokens[6];
					}
					else if (tokens[2] == "P") { 
						String quantityPurchased = tokens[3];
					} 
				}
				s.close();
			}
		}
		catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		Gson test = new GsonBuilder().setPrettyPrinting().create();
		test.toJson(invoiceItems);
		String prettyJson = test.toJson(invoiceItems);
		File w = new File("data/InvoiceItems.json");
		PrintWriter pw;
		try {
			pw = new PrintWriter(w);
			pw.println(prettyJson);
			pw.close();
		} catch (FileNotFoundException x) {
			x.printStackTrace();
		}
		return invoiceItems; 
	}
	public static void main(String[] args) {
		loadPersonsData();
		loadInvoiceData();
		loadStoreData();	
		loadInvoiceData();
		loadItems();
	}
}