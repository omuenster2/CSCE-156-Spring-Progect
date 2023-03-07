package com.fmt;



/**
 * @author oliviamuenster marywaller
 * 
 * 2023-24-02
 * 
 * Created a class that will hold the shared data for all of the services that are offerers at FaMaRt.
 *
 */
public abstract class Item {
protected String code;
protected char type;
protected String name;

public String getCode() {
	return code;
	}
public char getType() {
	return type;
	}
public String getName() {
	return name;
	}
public Item(String code, char type, String name) {
	super();
	this.code = code;
	this.type = type;
	this.name = name;
	}
}

