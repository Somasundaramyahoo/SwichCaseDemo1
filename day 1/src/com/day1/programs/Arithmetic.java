package com.day1.programs;

public class Arithmetic {
	public static void main(String[] args) {
		int investment= 100000;
		int profit=30000;
		int balance=investment+profit;
		int profitPercentage=(profit*100)/investment;
		System.out.println("invest="+investment);
		System.out.println("profit="+profit);
		System.out.println("Balance="+balance);
		System.out.println("Profit percentage="+profitPercentage);
	}

}
