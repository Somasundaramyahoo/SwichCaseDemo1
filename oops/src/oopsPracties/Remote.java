package oopsPracties;

public class Remote {
 private String color;
 private int price;
 private boolean isAAbattery;
 public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public int getPrice(){
		return price;
	}
	public void setIsAAbattery(boolean isAAbattery){
		this.isAAbattery=isAAbattery;
	}
	public boolean getIsAAbattery(){
		return isAAbattery;
	}
 public Remote(String color,int price,boolean isAAbattery){
	 this.color=color;
	 this.price=price;
	 this.isAAbattery=isAAbattery;
 }
 public String toString(){
	 return color+", "+price+", "+isAAbattery;
 }
}
