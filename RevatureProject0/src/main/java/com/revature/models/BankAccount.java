package com.revature.models;

public class BankAccount {
	private String accountNumber;
	private double balance;

	public BankAccount() {
	}

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	// deposit
	public void deposit(double balance) {
		this.balance += balance;
	}
	
	// withdraw
	public void withdraw(double total) {
		this.balance -= total;
	}
	
	//transfer funds
	public void transferTo(BankAccount bank, double fund) {
		if(fund <= this.balance) {
			withdraw(fund);
			bank.deposit(fund);
			System.out.println("Transfer was successful.");
		} else {
			System.out.println("Transfer failed.");
		}
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber= " + accountNumber + ", balance= " + balance + "]";
	}
}
