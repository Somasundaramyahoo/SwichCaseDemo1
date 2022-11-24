package LMSpracties;

public class CarTest {
public static void main(String[] args) {
	String values[]=args[0].split(",");
	String brand= values[0];
	String color=values[1];
	int price=Integer.parseInt(values[2]);
	boolean isPetrol=Boolean.parseBoolean(values[3]);
	System.out.println("brand is = "+brand);
	System.out.println("color is ="+color);
	System.out.println("price is = "+price);
	System.out.println("Is petrol = "+isPetrol);
	
}
}
