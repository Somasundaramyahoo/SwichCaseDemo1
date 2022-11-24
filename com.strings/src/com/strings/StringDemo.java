package com.strings;

public class StringDemo {
public static void main(String[] args) {
/*int num=Integer.parseInt(args[0]);
int add=0;
int mul=1;
for(int i=1; i<=num; i++){
	add=add+i;
	mul=mul*add;
}
System.out.println(mul);
*/
	
	int add=0;
	int add2=1;
	int add3=1;
	System.out.println(add);
	System.out.println(add2);
	System.out.println(add3);
	for(int i=0;i<4; i++){
		add=add+add2;
		add2=add+add2;
		add3=add+add2;
		System.out.println(add2);
		System.out.println(add3);
	}
}
}
