package com.edwardim.bankaccount;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account1 = new BankAccount(200.0, 200.0);
		BankAccount account2 = new BankAccount(100.00,100.00);
		
		System.out.println(BankAccount.totalAccounts);
		System.out.println(account1.getAccountNum());
		System.out.println(account2.getAccountNum());
		
		System.out.println(account1.getCheckingBalance());
		account1.deposit("checking", 300.00);
		System.out.println(account1.getCheckingBalance());
		
		
	}

}
