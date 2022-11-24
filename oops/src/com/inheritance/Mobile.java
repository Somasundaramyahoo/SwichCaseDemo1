package com.inheritance;

public class Mobile extends Electronic {
 String brand;
 int price;
 int noOfSim;
 public Mobile(String power,String product,int storage,String brand,int price,int noOfSim){
	 super(power,product,storage);
	 this.brand=brand;
	 this.price=price;
	 this.noOfSim=noOfSim;
 }
 public String toString(){
	 return super.toString()+"\nbrand = "+brand+"\nprice = "+price+"\nnoOfSim"+noOfSim;
 }
}
