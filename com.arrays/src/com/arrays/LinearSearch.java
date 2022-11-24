package com.arrays;
import java.util.Scanner;

public class LinearSearch {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("please enter size of array : ");
	int n=scan.nextInt();   //size of array
	int a[]=new int[n];   //array creation
	// accepting element in array
	for(int i=0; i<=a.length-1; i++){
		System.out.println("please enter element for index : "+i);
		a[i]=scan.nextInt();
	}
	System.out.println("pleace enter element to search");
	 int key=scan.nextInt();
	 boolean found=false;
	 int idx=0;
	  for(int i=0; i<=a.length-1; i++)
		 {
		 if(a[i]==key)
		 {
			idx=i;
			found=true;
			break;
		 }
		 }
		 if(found==true)
		 {
			 System.out.println("key was found at index : "+idx);
		 }
		 else
		 {
			 System.out.println("key was not found");
		 }
	 }
}