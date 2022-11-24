package oopsPracties;

public class Fridge {
	private String brand, color;
	private int price;
	private boolean isDoubleDoor;

	public void setBrand(String brand) {
		this.brand = brand;

	}

	public String getBrand() {
		return brand;

	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setPrice(int price) {
		this.price = price;

	}

	public int getPrice() {
		return price;
	}

	public void setIsDoubleDoor(boolean isDoubleDoor) {
		this.isDoubleDoor = isDoubleDoor;
	}

	public boolean getIsDoubleDoor() {
		return isDoubleDoor;
	}

	public Fridge(String brand, String color, int price, boolean isDoubleDoor) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.isDoubleDoor = isDoubleDoor;
	}

	public String toString() {
		return brand + ",  " + color + ",  " + price + ",  " + isDoubleDoor;
	}

}
	`