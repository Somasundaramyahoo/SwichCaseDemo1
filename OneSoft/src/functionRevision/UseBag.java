package functionRevision;

public class UseBag {
public static void main(String[] args) {
	Bag b1=new Bag();
	Bag b2=new Bag();
	Bag b3=new Bag();
	Bag b4=new Bag();
	
	
	b1.brand="exo";
	b1.color="red";
	b1.NoOfJip=3;
	b1.isWaterProof=true;
	b1.price=700;
	
	b2.brand="fastrack";
	b2.color="blue";
	b2.NoOfJip=4;
	b2.isWaterProof=true;
	b2.price=900;
	
	b3.brand="abc";
	b3.color="green";
	b3.NoOfJip=2;
	b3.isWaterProof=false;
	b3.price=800;
	
	b4.brand="xyz";
	b4.color="white";
	b4.NoOfJip=3;
	b4.isWaterProof=false;
	b4.price=600;
	
	Bag[] bags=new Bag[4];
	bags[0]=b1;
	bags[1]=b2;
	bags[2]=b3;
	bags[3]=b4;
	
	b1.findMaxPrice(bags);
	System.out.println(b1.findMinPrice(bags));
}
}
