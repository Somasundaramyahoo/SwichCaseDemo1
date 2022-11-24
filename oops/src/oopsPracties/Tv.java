package oopsPracties;

public class Tv {
private String brand;
private int price1;
private boolean isLED;
private Remote remote;
public void setRemote(Remote remote){
	this.remote=remote;
}
public Remote getRemote(){
	return remote;
}
public void setBrand(String brand){
	this.brand=brand;
}
public String getBrand(){
	return brand;
}
public void setPrice(int price1){
	this.price1=price1;
}
public int getPrice(){
	return price1;
}
public void setIsLED(boolean isLED){
	this.isLED=isLED;
}
public boolean getIsLED(){
	return isLED;
}
public Tv(String brand,int price1,boolean isLED,Remote remote){
	this.brand=brand;
	this.price1=price1;
	this.isLED=isLED;
	this.remote=remote;
}
public String toString(){
	return brand+", "+price1+", "+isLED+", "+remote;
}
}
