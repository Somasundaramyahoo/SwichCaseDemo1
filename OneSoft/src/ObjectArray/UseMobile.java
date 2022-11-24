package ObjectArray;

public class UseMobile {
public static void main(String[] args) {
	Mobile m1=new Mobile();
	Mobile m2=new Mobile();
	Mobile m3=new Mobile();
	
	m1.brand="samsung";
	m1.color="white";
	m1.price=25000;
	
	m2.brand="vivo";
	m2.color="blue";
	m2.price=26000;
	
	m3.brand="MI";
	m3.color="black";
	m3.price=28000;
	
	Mobile[] mobiles={m1,m2,m3};
	String offer="taxfree";
	
	for(Mobile m:mobiles){
		if(m.brand.equals("vivo")){
			System.out.println();
			System.out.println("brand = "+m.brand+"\n color = "+m.color+"\n price = "+offer);
			
		}
		else{
			System.out.println();
			System.out.println("brand = "+m.brand+"\n color = "+m.color+"\n price = "+(m.price+5000) );
		}
	}
}
}
