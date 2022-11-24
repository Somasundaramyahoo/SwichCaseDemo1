package Map;

import java.util.HashMap;

public class Demo {
public static void main(String[] args) {
      HashMap<Integer,String> hm=new HashMap<>();
      hm.put(963, "somu");
      hm.put(956, "rahul");
      hm.put(959, "livya");
      hm.put(952, "kowsik");
    /*  System.out.println(hm.keySet());
      System.out.println(hm.values());
      System.out.println(hm.get(963));
      System.out.println(hm.remove(959));
      System.out.println(hm);
      
  //for loop
      for(Integer h:hm.keySet()){
    	  System.out.println(h);
      }
      hm.keySet().forEach(x->System.out.println(x));

      hm.values().forEach(y->System.out.println(y));
      */
      for(Integer h:hm.keySet()){
    	  if(h%2==0){
    		  System.out.println("even keys = "+h);
    	  }
      }/*
      for(Integer h:hm.keySet()){
    	  if(h%2==0){
    			  System.out.println(hm.get(h));
    		  }
    	  
      }
      */
       
      
      
}
}


