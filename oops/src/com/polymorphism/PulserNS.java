package com.polymorphism;

public class PulserNS extends Pulser {
public  int price(){
	return 150000;
}
public int speed(){
	return 200;
}
public static void main(String[] args) {
	PulserNS p=new PulserNS();
	System.out.println(p.price());
}
}
