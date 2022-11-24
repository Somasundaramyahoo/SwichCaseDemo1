package ObjectArray;

public class UseAirConditioner {
public static void main(String[] args) {
	AirConditioner a1=new AirConditioner();
	AirConditioner a2=new AirConditioner();
	AirConditioner a3=new AirConditioner();
	
	a1.brand="somu";
	a1.color="white";
	a1.price=20000;
	a1.isFiveStar=true;
	
	a2.brand="abc";
	a2.color="red";
	a2.price=18000;
	a2.isFiveStar=false;
	
	a3.brand="xyz";
	a3.color="blue";
	a3.price=15000;
	a3.isFiveStar=false;
	 	
	AirConditioner[] ac={a1,a2,a3};
	int count=0;
	for(AirConditioner a:ac){
		/*if(a.isFiveStar==true){
			System.out.println(a.price-(a.price*8/100));
		}*/
		System.out.println(" brand name = "+a.brand);
		count++;
		if(count==2)
		break;
	}
	
}
}
