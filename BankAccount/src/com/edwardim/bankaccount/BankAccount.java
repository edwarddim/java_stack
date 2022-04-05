package com.edwardim.bankaccount;

public class BankAccount {
	// MEMBER VARIABLES	
	private double checkingBalance;
	private double savingsBalance;
	
	
	// CLASS VARIABLES
	public static int numOfAccounts = 0;
	public static String test;
	
	// CONSTRUCTORS
	public BankAccount() {
		super();
		numOfAccounts++;
	}

	public BankAccount(double checkingBalance, double savingsBalance) {
		super();
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		numOfAccounts++;
	}
	
	
	// GETTERS AND SETTERS
	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	// CLASS METHOD
	public static void displayNumAccounts() {
		System.out.print("Accounts Active: ");
		System.out.println(numOfAccounts);
	}
	
	
	
	// OTHER METHODS
}
