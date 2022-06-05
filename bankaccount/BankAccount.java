package com.edwardim.bankaccount;
import java.util.Random;


public class BankAccount {
	// MEMBER VARIALBES (ATTRIBUTES)
	private String accountNum;
	private double checkingBalance;
	private double savingsBalance;
	
	// CLASS VARIABLES
	public static int totalAccounts;
	public static double totalAmount;
	
	
	// CONSTRUCTOR
	// EMPTY CONSTRUCTOR
	public BankAccount() {
		totalAccounts++;
	}
	// FULL CONSTRUCTOR
	public BankAccount(double checkingBalance, double savingsBalance) {
		super();
		this.accountNum = generateAccountNum();
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		totalAccounts++;
	}
	
	// OTHER METHODS
	public void deposit(String accountType, double amount) {
		// CHECK WHICH ACCOUNT TYPE IS BEING DEPOSITED TO
		if( accountType.equals("checking") ) {
			System.out.println("Checking account being deposited");
			this.checkingBalance += amount;
			totalAmount += amount;
		}
		else if( accountType.equals("savings") ) {
			this.savingsBalance += amount;
			System.out.println("Savings account being deposited");
			totalAmount += amount;
		}
		else {
			System.out.println("You must input checking or savings");
		}
	}
	
	public void withdraw(String accountType, double amount) {
		if(amount > this.checkingBalance && accountType.equals("checking")) {
			System.out.println("insufficient funds");
		}
	}
	
	
	private String generateAccountNum() {
		// GENERATE A RANDOM NUMBER
		Random generator = new Random();
		String accountNum = "";
		// CREATE A FOR LOOP
		for(int i = 0; i < 10; i++) {
			int num = generator.nextInt(10);
			accountNum += num;
		}
		return accountNum;
	}
	
	
	
	// GETTERS AND SETTERS
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
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
	

	
}
