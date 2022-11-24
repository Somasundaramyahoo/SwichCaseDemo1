package oopsPracties;

public class UseTv {
public static void main(String[] args) {
	Remote r=new Remote("red",50,true);
	
	//System.out.println(r);
	Tv t=new Tv("sony",30000,true,r);
	Tv t2=new Tv("samsung",40000,true,r);
	Tv t3=new Tv("bravia",29000,true,r);
	
	Tv[] a={t,t2,t3};
    int max=0;
   Tv x=null;
   for(int i=0; i<a.length; i++){
	   if(a[i].getPrice()>max){
		   max=a[i].getPrice();
		   x=a[i];
	   }
   }
	System.out.println(t);
	System.out.println(x.getBrand()+", "+x.getPrice()+", "+x.getIsLED());
}
}
