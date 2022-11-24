package com.day1.programs;

public class Relational {
	public static void main(String[] args) {
		int num1=10;
				int num2=7;
				boolean isEqual= num1==num2;
				boolean isNum1Greater=num1>num2;
				boolean isNum2Greater = num2>num1;
				boolean isNum1LessThanOrEqualNum2= num1<=num2;
				boolean isNum1GreaterThanOrEqualNum2= num2<=num1;
				boolean isnum1NotEqualNum2=num1!=num2;
				System.out.println(num1+" is equal to "+num2+" : "+isEqual);
				System.out.println(num2+" is equal to "+num1+" : "+isEqual);
				System.out.println(num1+" is Greater than "+num2+" : "+isNum1Greater);
				System.out.println(num2+" is Greater than "+num1+" : "+isNum2Greater);
				System.out.println(num1+"  is Less Than or equal to "+num2+" : "+isNum1LessThanOrEqualNum2);
				System.out.println(num2+"  is Less Than or equal to "+num1+" : "+isNum1LessThanOrEqualNum2);
				System.out.println(num1+" is not equal to "+num2+" : "+ isnum1NotEqualNum2);
	}

}
