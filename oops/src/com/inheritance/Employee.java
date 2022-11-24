package com.inheritance;

public class Employee extends Human {
 private int id;
 private int salary;
 private String designation;
 public void setId(int id){
	 this.id=id;
 }
 public int getId(){
	 return id;
 }
 public void setSalary(int salary){
	 this.salary=salary;
 }
 public int getSalary(){
	 return salary;
 }
 public void setDesignation(String designation){
	 this.designation=designation;
 }
 public Employee(String name,String gender,int age,int id,int salary,String designation){
	 super(name,gender,age);
	 this.id=id;
	 this.salary=salary;
	 this.designation=designation;
 }
 public String toString(){
	 return super.toString()+"id = "+id+"\nsalary = "+salary+"\ndesignation = "+designation;
 }
}
