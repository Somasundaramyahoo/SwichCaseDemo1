package com.abstraction;

public abstract class Developer implements Human {
   public void eat(){
	   System.out.println("3 times a day");
   }
   public String sleep(int time){
	   if(time>=21 && time<=24){
		   return "sleeping time";
	   }
	   else if(time<=0 && time>=6){
		   return "deep sleep";
	   }
	   else if(time<6 && time>21){
		   return "working time";
	   }
	   else{
		   return "not time";
	   }
   }
   public abstract int  calculateSalary(String designation);
}
