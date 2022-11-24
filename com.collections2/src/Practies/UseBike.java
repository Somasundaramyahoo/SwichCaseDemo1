package Practies;

import java.util.HashMap;
import java.util.Iterator;

public class UseBike {
	public static void main(String[] args) {
		Bike b1 = new Bike("pulsur", "black", "ns200", "TN24AB1436", 270000, 150);
		Bike b2 = new Bike("r15", "white", "classic 120", "TN24AB1431", 190000, 160);
		Bike b3 = new Bike("yamaha", "blue", "v20", "TN24AB1432", 180000, 170);
		Bike b4 = new Bike("hero", "blue", "abc", "TN24AB1433", 80000, 180);
		Bike b5 = new Bike("honda", "black", "xyz", "TN24AB1434", 90000, 190);
		Bike b6 = new Bike("duke", "yellow", "str", "TN24AB1436", 250000, 200);
		HashMap<String, Bike> hm = new HashMap<>();
		hm.put(b1.getNumPlate(), b1);
		hm.put(b2.getNumPlate(), b2);
		hm.put(b3.getNumPlate(), b3);
		hm.put(b4.getNumPlate(), b4);
		hm.put(b5.getNumPlate(), b5);
		hm.put(b6.getNumPlate(), b6);
		// for(Bike h:hm.values()){
		// System.out.println(h);
		// }
		
		  HashMap<String,Bike>hm1=new HashMap<>();
		  for(Bike y:hm.values()){
		  if(y.getBrand().length()%2==0){ 
			  hm1.put(,y );
		  System.out.println(hm1);
		  }
		  }
		  /*
		  HashMap<String,Bike>hm2=new
		  HashMap<>(); hm.keySet().forEach(x->{
		  if(hm.get(x).getPrice()<=100000){ 
			  hm2.put(x, hm.get(x));
		  System.out.println(hm2.get(x));
		  }
		  });
		 
		/*
		 * HashMap<String,Bike>hm3=new HashMap<>(); for(String a:hm.keySet()){
		 * if(hm.get(a).getColor().equalsIgnoreCase("black")){ hm.remove(a);
		 * hm3.put(a, hm.get(a));
		 * 
		 * } } System.out.println(hm3);
		 * 
		 * Iterator<Bike>x=hm.values().iterator();
		 * 
		 * while(x.hasNext()){
		 * if(x.next().getColor().equalsIgnoreCase("black")){ x.remove(); } }
		 * System.out.println(hm);
		 
		Iterator<String> x = hm.keySet().iterator();

		while (x.hasNext()) {
			if (hm.get(x.next()).getColor().equalsIgnoreCase("black")) {
				x.remove();
			}
		}
		System.out.println(hm);
		*/
	}
}
