package com.inheritance;

public class Human {
private String name,gender;
private int age;
public void setName(String name){
	this.name=name;
}
public String getName(){
	return name;
}
 public void setGender(String gender){
	 this.gender=gender;
 }
 public String getGender(){
	 return gender;
 }
 public void setAge(int age){
	 this.age=age;
 }
 public int getAge(){
	 return age;
 }
 public Human(String name,String gender,int age){
	 this.name=name;
	 this.gender=gender;
	 this.age=age;
 }
 public String toString(){
	 return "name = "+name+"\nage = "+age+"\ngender = "+gender;
 }
}
