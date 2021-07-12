package com.revature.models;

public class Employee extends User {
// Customer extends user but there has to be something to separate customer and employee 

	public Employee() {
		super.setCustomerAccess(false);
		super.setEmployeeAccess(true);
	}
	
	public Employee(String username, String firstName, String lastName, String password) {
		super(username, firstName, lastName, password);
	}
}
