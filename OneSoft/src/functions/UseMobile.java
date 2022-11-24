package functions;

public class UseMobile {
public static void main(String[] args) {
	Mobile m1=new Mobile();
	Mobile m2=new Mobile();
	Mobile m3=new Mobile();
	Mobile m4=new Mobile();
	Mobile m5=new Mobile();
    
	m1.brand="samsung";
	m1.color="white";
	m1.price=25000;
	m1.isWaterProof=true;
	
	m2.brand="vivo";
	m2.color="blue";
	m2.price=26000;
	m2.isWaterProof=true;
	
	m3.brand="MI";
	m3.color="black";
	m3.price=15000;
	m3.isWaterProof=true;
	
	m5.brand="MI";
	m5.color="yellow";
	m5.price=22000;
	m5.isWaterProof=false;
	
	m5.brand="abc";
	m5.color="red";
	m5.price=28000;
	m5.isWaterProof=false;

	Mobile[] mobiles={m1,m2,m3,m4,m5};
	System.out.println(m1.maxBrand(mobiles));
	System.out.println(m1.findCount(mobiles));
	
	
}
}
