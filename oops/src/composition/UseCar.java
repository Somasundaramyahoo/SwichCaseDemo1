package composition;

public class UseCar {
public static void main(String[] args) {
	Engine e1=new Engine();
	e1.hp=250;
	e1.manufacturer="volks wagan";
	e1.price=50000;
	Car car1=new Car();
	car1.brand="bugatti";
	car1.color="black";
	car1.engine=e1;
	car1.price=1000000;
	System.out.println(car1.brand+",  "+car1.color+",  "+car1.price+",  "+car1.engine.hp+",  "+car1.engine.manufacturer+",  "+car1.engine.price);
}
}
