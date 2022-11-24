package ArrayList;

public class Fan {
 private  String brand,color;
  private int price;
  private boolean isFourWings;
  void setBrand(String brand){
	  this.brand=brand;
  }
  String getBrand(){
	  return brand;
  }
  void setColor(String color){
	  this.color=color;
  }
  String getColor(){
	  return color;
  }
  void setPrice(int price){
	  this.price=price;
  }
  int getPrice(){
	  return price;
  }
  void setIsFourWings(boolean isFourWings){
	  this.isFourWings=isFourWings;
  }
  boolean getIsFourWings(){
	  return isFourWings;
  }
  Fan(String brand,String color,int price,boolean isFourWings){
	  this.brand=brand;
	  this.color=color;
	  this.price=price;
	  this.isFourWings=isFourWings;
  }
  public String toString(){
	  return brand+",  "+color+",  "+price+",  "+isFourWings;
  }
}
