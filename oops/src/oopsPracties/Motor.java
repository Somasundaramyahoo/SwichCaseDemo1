package oopsPracties; 

public class Motor {
int price;
int wattsPower;
public void setPrice(int price){
	this.price=price;
}
public int getPrice(){
	return price;
}
public void setWattsPower(int wattsPower){
	this.wattsPower=wattsPower;
}
public int getWattsPower(){
	return wattsPower;
}
public Motor(int price,int wattsPower){
	this.price=price;
	this.wattsPower=wattsPower;
}
public String toString(){
	return " motor price = "+price+",  motor wattsPower = "+wattsPower;
}
}
