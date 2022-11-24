package com.abstraction;

public class SkilledEmployee implements Employee{
	public int calculateSalary(int perDaySalary, int noOfDayPresent){
		return perDaySalary*noOfDayPresent;
	}
	public String designation(String designation){
		return designation;
	}

}
