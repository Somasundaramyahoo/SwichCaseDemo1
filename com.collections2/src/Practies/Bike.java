package Practies;

public class Bike {
     String brand,color,model,numPlate;
     int price,engineCC;
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
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getNumPlate() {
		return numPlate;
	}
	public void setNumPlate(String numPlate) {
		this.numPlate = numPlate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	public Bike(String brand, String color, String model, String numPlate, int price, int engineCC) {
		this.brand = brand;
		this.color = color;
		this.model = model;
		this.numPlate = numPlate;
		this.price = price;
		this.engineCC = engineCC;
	}
	public String toString() {
		return "Bike [brand=" + brand + ", color=" + color + ", model=" + model + ", numPlate=" + numPlate + ", price="
				+ price + ", engineCC=" + engineCC + "]";
	}
	
     
}
