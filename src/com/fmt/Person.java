package com.fmt;



/**
 * @author oliviamuenster marywaller
 * 
 *  Created a name class to hold the shared value between store and person data.
 *
 */
public class Person {
	
protected String firstName;
protected String lastName;

public Person(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}

}
