package com.abstraction;

public class JavaDeveloper extends Developer {
   public int calculateSalary(String designation){
	   if(designation.equalsIgnoreCase("HR")){
		   return 75000;
	   }
	   else if(designation.equalsIgnoreCase("TL")){
		   return 50000;
	   }
	   else if(designation.equalsIgnoreCase("developer")){
		   return 30000;
	   }
	   else{
		   return 20000;
	   }
   }
}
