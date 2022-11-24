package com.abstraction;

public class DetailsCourse implements Course{
	public String courseName(String course){
		return course;
	}
	public String trainerName(String trainerName){
		return trainerName;
	}
	public String courseDuration(String courseName){
		if(courseName.equalsIgnoreCase("java")||courseName.equalsIgnoreCase("python")||courseName.equalsIgnoreCase("C++")){
		 return "two months of duration";
		}
		else{
		return "six months of duration";
		}
	}
	public int courseFees(String courseName){
		if(courseName.equalsIgnoreCase("java")){
			return 15000;
		}
		else if (courseName.equalsIgnoreCase("python")){
	return 20000;
		}
		else if(courseName.equalsIgnoreCase("C++")){
			return 35000;
		}
		else{
			return 10000;
		}
	}
}
