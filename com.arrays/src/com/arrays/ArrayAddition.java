package com.arrays;

import java.util.Scanner;

public class ArrayAddition {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter size of array : ");
		int n=scan.nextInt();   //size of array
		int a[]=new int[n];//array creation
		int b[]=new int[n];
		int c[]=new int[n];
		// accepting element in array
		for(int i=0; i<=a.length-1; i++){
			System.out.println("please enter element for a index : "+i);
			a[i]=scan.nextInt();
		}
		for(int i=0; i<=a.length-1; i++){
			System.out.println("please enter element for b index : "+i);
			b[i]=scan.nextInt();
		}
		  // displaying arrays
		System.out.println();
		System.out.println("elements of array c : ");
		for(int i=0; i<=a.length-1; i++){
			System.out.print(a[i]+b[i]+" ");
}	
}
}