package com.bl.StockAccountManagement;

import java.util.ArrayList;

public class Stock {
	
	  public static void stocks() {
		  ArrayList<String> stocks = new ArrayList<>();
			stocks.add("Reliance");
			stocks.add("TCS");
						
			System.out.println(stocks);
	  }

	  public static void main(String[] args) {
		  StockPortfolio value = new StockPortfolio();
		  stocks();
		  value.calculateStock();
		  value.calculateTotalStock();
	}
	  
}
