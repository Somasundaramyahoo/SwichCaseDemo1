package com.abstraction;

public class UseSonyAc {
public static void main(String[] args) {
	SonyAc s=new SonyAc();
	System.out.println(s.onOrOff(true));
	System.out.println(s.electronics("ac"));
	System.out.println(s.calculateTemp(26));
	System.out.println(s.maintainence(false));
	
}
}
