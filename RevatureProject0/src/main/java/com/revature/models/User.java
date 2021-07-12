package com.revature.models;

import java.util.Random;

public class User {
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private boolean access;
	
	public User() {
		super();
	}

	public User(String firstName, String lastName, String username , String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = firstName + lastName;
		this.password = password  + (new Random().nextInt(9000) + 1000);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}
	
	public boolean getAccess() {
		return access;
	}
	
	public void setCustomerAccess(boolean CustomerAccess) {
		CustomerAccess = this.access;
	}
	
	public void setEmployeeAccess(boolean EmployeeAccess) {
		EmployeeAccess = this.access;
	}

	@Override
	public String toString() {
		return "Users [firstName= " + firstName + ", lastName= " + lastName + ", userName= " + userName + ", password= "
				+ password + "]";
	}
}
