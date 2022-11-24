package oopsPracties;

public class Fan {
 private String brand;
 private int price;
 private boolean isFourWings;
 Motor motor;
  public void setBrand(String brand){
	  this.brand=brand;
  }
  public String getBrand(){
	  return brand;
  }
  public void setPrice(int price){
	  this.price=price;
  }
  public int getPrice(){
	  return price;
  }
  public void setIsFourWings(boolean isFourWings){
	  this.isFourWings=isFourWings;
  }
  public boolean getIsFourWings(){
	  return isFourWings;
  }
  public Fan(String brand, int price,boolean isFourWings){
	  this.brand=brand;
	  this.price=price;
	  this.isFourWings=isFourWings;
  }
  public String toString(){
	  return "fan Brand = "+brand+",  fan Price = "+price+",  fan isFourWings = "+isFourWings;
  }
}
