package LMSpracties;

public class UseFan {
	public static void main(String[] args) {
	 Fan f1=new Fan();
	 Fan f2=new Fan();
	 String values1[]=args[0].split(",");
	 String values2[]=args[1].split(",");
	 f1.brand=values1[0];
	 f1.color=values1[1];
	 f1.price=Integer.parseInt(values1[2]);
	 f1.tax=Integer.parseInt(values1[3]);
	 f1.netPrice=f1.price+f1.tax;
	 f2.brand=values2[0];
	 f2.color=values2[1];
	 f2.price=Integer.parseInt(values1[2]);
	 f2.tax=Integer.parseInt(values1[3]);
	 f2.netPrice=f2.price+f2.tax;
	 System.out.println("brand = "+f1.brand+"\n"+"color = "+f1.color+"\n"+"price = "+f1.price+"\n"+"fan tax is = "+f1.tax+"\n"+f1.netPrice);
System.out.println();
	 System.out.println("brand = "+f2.brand+"\n"+"color = "+f2.color+"\n"+"price = "+f2.price+"\n"+"fan tax is = "+f2.tax+"\n"+"net price = "+f2.netPrice);

	}
	
}
class Fan {
	String brand;
	String color;
	int price;
	int tax;
	int netPrice;
}
