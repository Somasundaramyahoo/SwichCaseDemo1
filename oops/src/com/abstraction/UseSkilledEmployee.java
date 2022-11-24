package com.abstraction;

public class UseSkilledEmployee {
public static void main(String[] args) {
	SkilledEmployee s=new SkilledEmployee();
	System.out.println(s.calculateSalary(1000,20));
	System.out.println(s.designation("developer"));
}
}
