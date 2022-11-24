package ObjectArray;

public class UseBus {
public static void main(String[] args) {
	Bus b1=new Bus();
	Bus b2=new Bus();
	Bus b3=new Bus();
	Bus b4=new Bus();
	
	b1.brand="abc";
	b1.BusNo="TN24at1234";
	b1.color="red";
	b1.price=5000000;
	
	b2.brand="toyoto";
	b2.BusNo="AP48gt6783";
	b2.color="blue";
	b2.price=45000000;
	
	b3.brand="volvo";
	b3.BusNo="KA18hp3720";
	b3.color="white";
	b3.price=3000000;
	
	b4.brand="bmw";
	b4.BusNo="TN68oc1628";
	b4.color="green";
	b4.price=4000000;
	
	Bus[] buses={b1,b2,b3,b4};
	
	for(Bus b:buses){
		if(b.BusNo.contains("TN")){
			System.out.println();
			System.out.println(b.brand+"\n"+b.BusNo+"\n"+b.color+"\n"+b.price);
		}
	}
}
}
