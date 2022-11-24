package ObjectArray;

public class UseBottle {
public static void main(String[] args) {
	Bottle bottle1=new Bottle();
	Bottle bottle2=new Bottle();
	Bottle bottle3=new Bottle();
	
	bottle1.brand="somu";
	bottle1.color="red";
	bottle1.price=30;
	bottle1.type="glass";
	
	bottle2.brand="quality";
	bottle2.color="gray";
	bottle2.price=50;
	bottle2.type="silver";
	
	bottle3.brand="sundaram";
	bottle3.color="blue";
	bottle3.price=20;
	bottle3.type="plastic";
	
	Bottle[] bottles={bottle1,bottle2,bottle3};
	
	for(Bottle b:bottles){
		if(b.type.equals("glass")){
			System.out.println(b.brand+"\n"+b.color+"\n"+b.price);
		}
	}
}
}
