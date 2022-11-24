package com.abstraction;

public class BestUniversity extends University{
	public int noOfDepartments(int noOfDepartment){
		return noOfDepartment;
	}
    public int noOfProfessors(int noOfProfessors){
    	return noOfProfessors;
    }
    public int calculateFees (String course){
    	if(course.equalsIgnoreCase("science")){
    		return 35000;
    	}
    	else if(course.equalsIgnoreCase("arts")){
    		return 30000;
    	}
     	else if(course.equalsIgnoreCase("engineering")){
    		return 150000;
    	}
    	else if(course.equalsIgnoreCase("technology")){
    		return 180000;
    	}
    	else if(course.equalsIgnoreCase("ethics")){
    		return 50000;
    	}
    	else{
    		System.out.println(" course not available");
    		return 0;
    	}
    }
    public String universityName(String name){
    	return name;
    }
}
