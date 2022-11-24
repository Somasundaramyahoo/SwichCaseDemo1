package functions;

public class Mobile {
    String brand,color;
    int price;
    boolean isWaterProof;
    
    public String maxBrand(Mobile[] mobiles){
    	int max=0;
    	Mobile maximum=null;
    	for(Mobile m:mobiles){
    		if(m.price>=max){
    			max=m.price;
    			maximum=m;
    		}
    	}
    	return maximum.brand+" "+maximum.price+" "+maximum.color+" "+maximum.isWaterProof;
    	
    }
    public int findCount(Mobile[] mobiles){
    	int count=0;
    	for(Mobile m:mobiles){
    	if(m.isWaterProof==true){
    		count++;
    	}
    	} 
    	return count;
    	
    }
}
