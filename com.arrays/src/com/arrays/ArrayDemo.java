 package com.arrays;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		
	int a[][][]=new int [2][][];
	Scanner scan=new Scanner(System.in);
	a[0]=new int[3][];
	a[1]=new int[2][];
	a[0][0]=new int[3];
	a[0][1]=new int[4];
	a[0][2]=new int[2];
	a[1][0]=new int[3];
	a[1][1]=new int[2];
	for(int i=0; i<=a.length-1; i++)
	{
		for(int j=0; j<=a[i].length-1; j++)
		{
			for(int k=0; k<=a[i][j].length-1; k++){
				System.out.println("please enter marks for school : "+i+" class: "+j+" student: "+k);
				a[i][j][k]=scan.nextInt();
			}
		}
	}
	for(int i=0; i<=a.length-1; i++)
	{
		for(int j=0; j<=a[i].length-1; j++)
		{
			for(int k=0; k<=a[i][j].length-1; k++){
				System.out.print(a[i][j][k]+" ");
			}
			System.out.println();
		}
		System.out.println();
}
}
}