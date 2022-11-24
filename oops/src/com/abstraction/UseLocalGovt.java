package com.abstraction;

public class UseLocalGovt {
public static void main(String[] args) {
	LocalGovernment l=new LocalGovernment();
	System.out.println(l.typeOfGovernment());
	System.out.println(l.headQuarters("delhi"));
	System.out.println(l.noOfMla(15));
	System.out.println(l.rulingParty("XYZ")); 
}
}
