package com.inheritance;

public class SmartMobile extends Mobile {
  String display,processor,model;
  public SmartMobile(String power,String product,int storage,String brand,int price,int noOfSim,String display,String processor,String model){
	  super(power,product,storage,brand,price,noOfSim);
	  this.display=display;
	  this.processor=processor;
	  this.model=model;
  }
  public String toString(){
	  return super.toString()+"\ndisplay = "+display+"\nprocessor = "+processor+"\nmodel = "+model;
  }
}
