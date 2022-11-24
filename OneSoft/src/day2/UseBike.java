package day2;

public class UseBike {

	public static void main(String[] args) {
		Bike b= new Bike();
		Bike b1=new Bike();
		Bike b2=new Bike();
		b.brand="Honda";
		b.model= "Dio";
		b.color="Blue";
		b.price=100000;
		b.discount=10;
		b.netPrice=b.price-(b.price*b.discount/100);
		System.out.println("Honda bike details : ");
		System.out.println("bike brand is ="+b.brand+" , "+"bike model is = "+b.model+" , "+"bike color is = "+b.color+" , "+"bike price is = "+b.color+" , "+"discount is = "+b.discount+" , "+"bike net price is = "+b.netPrice);
		b1.brand="Hero";
		b1.model= "shine";
		b1.color="Red";
		b1.price=150000;
		b1.discount=10;
		b1.netPrice=b1.price-(b1.price*b1.discount/100);
		System.out.println("Hero bike details : ");
		System.out.println("bike brand is ="+b1.brand+" , "+"bike model is = "+b1.model+" , "+"bike color is = "+b1.color+" , "+"bike price is = "+b1.color+" , "+"discount is = "+b1.discount+" , "+"bike net price is = "+b1.netPrice);
		b2.brand="pulser";
		b2.model= "ns200";
		b2.color="Blue";
		b2.price=200000; 
		b2.discount=20;
		b2.netPrice=b2.price-(b2.price*b2.discount/100);
		System.out.println("Pulser bike details : ");
		System.out.println("bike brand is ="+b2.brand+" , "+"bike model is = "+b2.model+" , "+"bike color is = "+b2.color+" , "+"bike price is = "+b2.color+" , "+"discount is = "+b2.discount+" , "+"bike net price is = "+b2.netPrice);

	}

}
