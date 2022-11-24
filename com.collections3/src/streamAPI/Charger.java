package streamAPI;
 
public class Charger {
	private String brand,color;
	private boolean isCType;
	private int price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isCType() {
		return isCType;
	}
	public void setCType(boolean isCType) {
		this.isCType = isCType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Charger(String brand, String color, boolean isCType, int price) {
		this.brand = brand;
		this.color = color;
		this.isCType = isCType;
		this.price = price;
	}
	public String toString(){
		return brand +",  "+price+", "+color+", "+isCType;
	}

}
