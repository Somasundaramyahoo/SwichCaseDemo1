package oopsPracties;

public class UseFridge {
 public static void main(String[] args) {
	Fridge f1=new Fridge("LG","black",21000,true);
	Fridge f2=new Fridge("abc","blue",19000,false);
	Fridge f3=new Fridge("whirlpool","red",20000,true);
	Fridge[] fridges={f1,f2,f3};
	int max=0;
	Fridge a=null;
	for(int i=0; i<fridges.length; i++){
		if(fridges[i].getPrice()>=max){
			max=fridges[i].getPrice();
			a=fridges[i];
		}
	}
	System.out.println(f1);
	System.out.println(f2);
	System.out.println(f3);
	System.out.println("high price fridge = "+a.getBrand());
}
}