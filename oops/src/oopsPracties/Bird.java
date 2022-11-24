package oopsPracties;

public class Bird {
public String printBird(){
	return "it is a  bird";
}
//public String printBird(String name){
//	return name;
//}
public void food(boolean  isVeg){
	 if(isVeg==true){
		System.out.println("Harbivores");
	}
	 else{
		 System.out.println("Carnivores");
	 }
}
public void food(String foodType){
	if(foodType.equalsIgnoreCase("plants")||foodType.equalsIgnoreCase("fruits")){
		System.out.println("it is petbird");
	}
	else if(foodType.equalsIgnoreCase("meet")||foodType.equalsIgnoreCase("flush")){
		System.out.println("it is wildbird");
	}
	else if(foodType.equalsIgnoreCase("bugs")){
		System.out.println("it is domastic");
	}
}
}
