package LMSpracties;

public class UseBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike b1=new Bike();
Bike b2=new Bike();
Bike b3=new Bike();
String values1[]=args[0].split(",");
String values2[]=args[1].split(",");
String values3[]=args[2].split(",");
b1.brand=values1[0];
b1.color=values1[1];
b1.engcc=Integer.parseInt(values1[2]);
b1.price=Integer.parseInt(values1[3]);
b2.brand=values2[0];
b2.color=values2[1];
b2.engcc=Integer.parseInt(values2[2]);
b2.price=Integer.parseInt(values2[3]);
b3.brand=values3[0];
b3.color=values3[1];
b3.engcc=Integer.parseInt(values3[2]);
b3.price=Integer.parseInt(values3[3]);
System.out.println("brand = "+b1.brand+"\n"+"color = "+b1.color+"\n"+"price = "+b1.price+"\n"+"engine CC is = "+b1.engcc);
System.out.println( );

System.out.println("brand = "+b2.brand+"\n"+"color = "+b2.color+"\n"+"price = "+b2.price+"\n"+"engine CC is = "+b2.engcc);
System.out.println( );
System.out.println("brand = "+b3.brand+"\n"+"color = "+b3.color+"\n"+"price = "+b3.price+"\n"+"engine CC is = "+b3.engcc);
	}

}
