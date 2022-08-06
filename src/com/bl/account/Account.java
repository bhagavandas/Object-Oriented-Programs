package com.bl.account;

import java.util.Scanner;

public class Account {
	public void debit() {
		int account_bal = 50000;
		Scanner withdraw = new Scanner(System.in);
		System.out.println("Enter withdrawal Amount: ");
		int withdraw_bal = withdraw.nextInt();
		
		if(withdraw_bal < account_bal) {
			int Account_bal = account_bal - withdraw_bal;
		System.out.println("Account Balance: " + Account_bal);
			
		}
		else {
			System.out.println("Debit amount exceeded account balance.");
		}
	}		

}
