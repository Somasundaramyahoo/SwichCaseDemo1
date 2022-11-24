package com.polymorphism;

public class SBI extends RBI {
public int interestRate(int amount){
	return amount*12/100;
}
public static void main(String[] args) {
	SBI s=new SBI();
	System.out.println(s.interestRate(500000));
}
}
