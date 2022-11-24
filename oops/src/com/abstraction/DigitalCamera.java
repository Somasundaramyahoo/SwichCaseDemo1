package com.abstraction;

public class DigitalCamera implements Camera{
       public String focusType(){
    	   return"Auto Focus";
       }
       public void noOfFilters(String brand){
    	   if(brand.equalsIgnoreCase("nike")){
    		   System.out.println("no filters");
    	   }
    	   else{
    		   System.out.println("five types of filters");
    	   }
       }
}
