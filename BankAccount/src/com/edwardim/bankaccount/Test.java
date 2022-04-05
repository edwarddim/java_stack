package com.edwardim.bankaccount;

public class Test {

	public static void main(String[] args) {
		// INSTANTIATING A BANK ACCOUNT OBJECT
		BankAccount account_1 = new BankAccount();
		BankAccount account_2 = new BankAccount(200.0, 300.0);
		BankAccount account_3 = new BankAccount(200.0, 300.0);
		account_1.getCheckingBalance();
		account_2.getSavingsBalance();
		
		
		BankAccount.displayNumAccounts();
		
		
	}

}
