package com.abstraction;

public class UseBestUniversity {
public static void main(String[] args) {
	BestUniversity b=new BestUniversity();
	System.out.println(b.noOfDepartments(5));
	System.out.println(b.noOfProfessors(10));
	System.out.println(b.calculateFees("java"));
	System.out.println(b.universityName("akka"));
}
}
