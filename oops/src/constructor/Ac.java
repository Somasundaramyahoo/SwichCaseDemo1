package constructor;

public class Ac {
	String brand;
	float tons;
	int price;
	boolean isInvertor; 

	public Ac(String brand, float tons, boolean isInvertor, int price) {
		this.brand = brand;
		this.tons = tons;
		this.price = price;
		this.isInvertor = isInvertor;

	}

	public String toString() {
		return "Brand = " + brand + ", Tons = " + tons + ", Price = " + price + ",  IsInvertor = " + isInvertor;
	}
}
