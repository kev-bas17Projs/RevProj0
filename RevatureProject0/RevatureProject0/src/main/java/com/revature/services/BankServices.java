package com.revature.services;

import com.revature.models.BankAccount;
import com.revature.models.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

import com.revature.dao.BankAccountDao;
import com.revature.exceptions.InvalidCredentialsException;
import com.revature.exceptions.UserDoesNotExistException;
import com.revature.exceptions.UserNameAlreadyExistsException;
import com.revature.logging.*;



public class BankServices {
	
	//Transaction transaction;
	//BankAccount balance;
	
	//public BankAccount withdraw(double balance) {
		//transaction += balance;
		//return null;
	//}

	//public BankAccount deposit(double balance) {
		
		//return null;
	//}
	
	//public BankAccount transferFunds() {
		//return null;//
	
	
	private BankAccountDao bADao;
	
	public BankServices(BankAccountDao BA) {
		bADao = BA;
		
	}
	
	
	
	
}

