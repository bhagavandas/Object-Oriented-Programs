package com.bl.StockAccountManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
	public String shareName;
	public int numOfShare;
	public int sharePrice;
	public int totalshare1;
	public int totalshare2;
	

	ArrayList<StockPortfolio> stocks = new ArrayList<>();

	public void calculateStock() {
		Stock stock = new Stock();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Share Name : ");
		shareName = input.next();
		System.out.println("Enter Number of shares: ");
		numOfShare = input.nextInt();
		System.out.println("Enter share price: ");
		sharePrice = input.nextInt();
		
		totalshare1 = numOfShare * sharePrice;
		System.out.println("Value of each stock: " + totalshare1);
		
		System.out.println("Enter Share Name : ");
		shareName = input.next();
		System.out.println("Enter Number of shares: ");
		numOfShare = input.nextInt();
		System.out.println("Enter share price: ");
		sharePrice = input.nextInt();
		
		totalshare2 = numOfShare * sharePrice;
		System.out.println("Value of each stock: " + totalshare2);

	}
	
	public void calculateTotalStock() {
		int totalStockValue = totalshare1 + totalshare2;
		System.out.println("Value of Total stock: " + totalStockValue);
	}


}
