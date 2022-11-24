package com.polymorphism;

public class Bank {
public int loanAvailability(String name){
	return 50000;
}
public int loanAvailability(String name,int salary){
	return 50000+salary;
}
public int loanAvailability(String name,int salary,int property){
	return (50000+salary)*property;
}
}
