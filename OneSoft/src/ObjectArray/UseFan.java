package ObjectArray;

public class UseFan {
	public static void main(String[] args) {
		Fan fan1=new Fan();
		Fan fan2=new Fan();
		Fan fan3=new Fan();
		fan1.brand="usha";
		fan1.color="red";
		fan1.price=2000;
		
		fan2.brand="preethi";
		fan2.color="white";
		fan2.price=1500;
		
		fan3.brand="abc";
		fan3.color="blue";
		fan3.price=1000;
		
		Fan[] fans={fan1,fan2,fan3};
		
		int min=fan1.price;
		Fan minimumFan=fan1;
		for(Fan f:fans) {
			if(f.price<min) {
				min=f.price;
				minimumFan=f;
			}
		}
		System.out.println(minimumFan.brand+"\n"+minimumFan.color);
		
	}

}
