package ObjectArray;

public class UseCar {
	public static void main(String[] args) {
		Car car1=new Car();
		Car car2=new Car();
		Car car3=new Car();
		car1.brand="audi";
	    car1.color="blue";
	    car1.isPetrol=true;
	    car1.price=1500000;
	    
	    car2.brand="bmw";
	    car2.color="red";
	    car2.isPetrol=false;
	    car2.price=1300000;
	    
	    car3.brand="toyoto";
	    car3.color="white";
	    car3.isPetrol=true;
	    car3.price=1100000;
	    
	    Car[] cars={car1,car2,car3};
	    
	   /* for(int i=0; i<cars.length; i++){
	    	if(cars[i].brand.equals("toyoto")){
	    		System.out.println(cars[i].brand+"\n  "+cars[i].color+"\n  "+cars[i].price+"\n  "+cars[i].isPetrol);
	    		
	    	}
	    }*/
	    for(Car c:cars){
	    	if(c.color.equals("white")){
	    		System.out.println(c.brand);
	    	}
	    }
	    
	}

}
