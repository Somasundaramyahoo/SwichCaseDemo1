package functionRevision;

import functions.Mobile;

public class Bag {
 String brand,color;
 int price,NoOfJip;
 boolean isWaterProof;
 
 public void findMaxPrice(Bag[] bags){
	 int max=0;
 	Bag maximum=null;
 	for(int i=0; i<bags.length; i++){
 		if(bags[i].price>=max){
 			max=bags[i].price;
 			maximum=bags[i];
 		}
 	}
 	System.out.println(maximum.brand+" "+maximum.price+" "+maximum.color+" "+maximum.isWaterProof+" "+maximum.NoOfJip);
 	
 }
 public String findMinPrice(Bag[] bags){
	 int mini=bags[0].price;
	 Bag minimum=null;
	 for(Bag b:bags){
	 		if(b.price<=mini){
	 			mini=b.price;
	 			minimum=b ;
	 		}
	 	}
	 return minimum.brand+" "+minimum.price+" "+minimum.color+" "+minimum.isWaterProof+" "+minimum.NoOfJip;
 }
 }
