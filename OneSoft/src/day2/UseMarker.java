package day2;

public class UseMarker {

	public static void main(String[] args) {
		Marker m=new Marker();
		Marker m1=new Marker();
		
		m.brand="luxer";
		m.color="red";
		m.isRefill=false;
		m.price=20;
		m.shape="cylindrical";
		System.out.println("Marker  Details : ");
		System.out.println("Brand is = "+m.brand+" , "+"Color is = " +m.color+" , "+"Price is = "+m.price+" , "+"Shape is = "+m.shape+" , "+"Is Refill ="+m.isRefill);
		m1.brand="parker";
		m1.color="blue";
		m1.price=40;
		m1.shape="cylindrical";
		m1.isRefill=true;
		System.out.println("Marker -  1 - Details : ");
		System.out.println("Brand is = "+m1.brand+" , "+"Color is = " +m1.color+" , "+"Price is = "+m1.price+" , "+"Shape is = "+m1.shape+" , "+"Is Refill ="+m1.isRefill);
		int totalPrice= (m.price+m1.price);
		System.out.println("Total Price = "+totalPrice);
	}

}
