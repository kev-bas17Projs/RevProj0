package com.revature.models;

public class Customer extends User{
// Customer extends user but there has to be something to separate customer and employee 
	
	public Customer() {
		super.setCustomerAccess(true);
		super.setEmployeeAccess(false);
		
	}
	
	public Customer(String username, String firstName, String lastName, String password) {
		super(username, firstName, lastName, password);
	}
	
}
