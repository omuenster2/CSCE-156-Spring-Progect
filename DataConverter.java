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
	public static List<Customer> loadData() {
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
				
				//String personalID = tokens[0];
				//Address address = new Address(tokens[3], tokens[4], tokens[5], tokens[6], tokens[7]);
				//List<String> email = new ArrayList<String>();
				
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

	
	private static final String invoiceData = "Items.csv";
	public static List<Item> loadData1() {
		List<Item> invoice = new ArrayList<>();
		File i = new File(invoiceData);
		try {
			Scanner sca = new Scanner(i);
			while (sca.hasNextLine()) {
				String lines = sca.nextLine();
				String tokens[] = lines.split(",");
				String code = tokens[0];
				if (tokens[1] != null) {
					if(tokens[1] == "E") {
						String name = tokens[2];
						String model = tokens[3];
					}
					if(tokens[1] == "P") {
						String product = tokens[2];
						String unit = tokens[3];
						int unitPrice = Integer.parseInt(tokens[4]);
					}
					if(tokens[1] == "S") {
						String serviceName = tokens[2];
						double hourlyRate = Double.parseDouble(tokens[3]);
					}	
				}
			}
			sca.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		
		Gson test = new GsonBuilder().setPrettyPrinting().create();
		test.toJson(invoice);
		String prettyJson = test.toJson(invoice);
		File w = new File("data/Items.json");
		PrintWriter pw;
		try {
			pw = new PrintWriter(w);
			pw.println(prettyJson);
			pw.close();
		} catch (FileNotFoundException x) {
			x.printStackTrace();
		}
		
		return invoice;

	
	}
	private static final String storeData = "Stores.csv";
	public static List<StoreData> loadData2() {
		List<StoreData> store = new ArrayList<>();
// should this be storeData and not invoiceData???
		File stor = new File(storeData);
		try {
			Scanner sca = new Scanner(stor);
			while (sca.hasNextLine()) {
				String lines = sca.nextLine();
				String tokens[] = lines.split(",");
				String storeCode = tokens[0];
				String manager = tokens[1];
				Address address2 = new Address(tokens[2], tokens[3], tokens[4], tokens[5], tokens[6]);
				//double amountDue = Double.parseDouble(tokens[7]);
			}
			sca.close();
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
	public static void main(String[] args) {
		loadData();
		loadData1();
		loadData2();
		
	}
}
