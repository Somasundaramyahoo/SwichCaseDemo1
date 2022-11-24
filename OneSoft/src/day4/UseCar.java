package day4;

public class UseCar {
	public static void main(String[] args) {
Car c1=new Car();
Car c2=new Car();
c1.brand="audi";
c1.color="red";
c1.price=1500000;
c1.engineCC=4000;
c2.brand="bmw";
c2.color="blue";
c2.price=1200000;
c2.engineCC=5000;
if(c1.price>c2.price){
	System.out.println(c1.brand+"  is high price compare to  "+c2.brand);
	}
else{

	System.out.println(c1.brand+"  is high price compare to  "+c1.brand);
}
if(c1.brand.startsWith("b")){
	System.out.println(c1.brand+"  is starts with b ");
}
else{
	System.out.println(c2.brand+"  is starts with b ");
}
	}

}
