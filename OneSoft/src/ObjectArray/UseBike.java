package ObjectArray;

public class UseBike {
    public static void main(String[] args) {
		Bike bike1=new Bike();
		Bike bike2=new Bike();
		Bike bike3=new Bike();
		
		bike1.brand="hero";
		bike1.color="red";
		bike1.isPetrol=true;
		bike1.price=150000;
		
		bike2.brand="honda";
		bike2.color="blue";
		bike2.isPetrol=true;
		bike2.price=130000;
		
		bike3.brand="bmw";
		bike3.color="white";
		bike3.isPetrol=true;
		bike3.price=250000;
		
		Bike[] bikes={bike1,bike2,bike3};

        int max=0;
        Bike maximumBike=null;
        
        for(int i=0; i<bikes.length; i++ ){
        	if(bikes[i].price>max){
        	max=bikes[i].price;
        	maximumBike=bikes[i];
        	}
		}
		 System.out.println(maximumBike.brand);
	}
}
