package LMSpracties;

public class AddLMS {
public static void main(String[] args) {
	String values1[]= args[0].split("@");
	String values2[]= args[1].split("@");
	int num1=Integer.parseInt(values1[0]);
	int num2=Integer.parseInt(values1[1]);
	int num3=Integer.parseInt(values1[2]);
	int num4=Integer.parseInt(values2[0]);
	int num5=Integer.parseInt(values2[1]);
	int num6=Integer.parseInt(values2[2]);
	int result1=num1*num4;
	int result2=num2*num5;
	int result3=num3*num6;
	System.out.println("num1*num2 = "+result1+"\n"+"num2*num5 = "+result2+"\n"+"num3*num6 = "+result3);
	System.out.println();
	String values3[]= args[2].split("-");
	String values4[]= args[3].split("#");
	int n1=Integer.parseInt(values3[0]);
	int n2=Integer.parseInt(values3[1]);
	int n3=Integer.parseInt(values3[2]);
	int n4=Integer.parseInt(values4[0]);
	int n5=Integer.parseInt(values4[1]);
	int n6=Integer.parseInt(values4[2]);
	int res1=n1*n4;
	int res2=n2*n5;
	int res3=n3*n6;
	System.out.println("n1*n2 = "+res1+"\n"+"n2*n5 = "+res2+"\n"+"n3*n6 = "+res3);
	
}
}
