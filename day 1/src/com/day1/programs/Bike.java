package com.day1.programs;

public class Bike {
	public static void main(String[] args) {
		String name= "r15";
		String color="red";
		int price= 150000;
		int tax=5000;
		int discount= 20000;
		int finalPrice=(price+tax)-discount;
		System.out.println("Bike name="+name);
		System.out.println("Bike color="+color);
		System.out.println("final price"+finalPrice);
	}

}
