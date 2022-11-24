package com.inheritance;

public class Electronic {
  String power,product;
  int storage;
  public Electronic(String power,String product,int storage){
	  this.power=power;
	  this.product=product;
	  this.storage=storage;
  }
  public String toString(){
	  return "power = "+power+"\nproduct = "+product+"\nstorage = "+storage;
  }
}
