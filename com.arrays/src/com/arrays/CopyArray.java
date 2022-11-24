package com.arrays;

import java.util.Scanner;

public class CopyArray {
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
	int b[]=new int[n];       // 2nd array
	 // copying content from 1 to 2 nd array
	for(int i=0; i<=a.length-1; i++)
	{
		b[i]=a[i];
	}
	  // displaying arrays
	System.out.println("elements of array a : ");
	for(int i=0; i<=a.length-1; i++){
		System.out.print(a[i]+" ");
}
	System.out.println();
	System.out.println("elements of array b : ");
	for(int i=0; i<=a.length-1; i++){
		System.out.print(b[i]+" ");
}
}
}