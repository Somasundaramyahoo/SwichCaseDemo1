
package ArrayList;

import java.util.ArrayList;

public class UseFan {
public static void main(String[] args) {
       Fan f1=new Fan("usha","red",3000,true);	
       Fan f2=new Fan("preethi","blue",1500,true);
       Fan f3=new Fan("abc","red",2500,false);
       Fan f4=new Fan("xyz","white",1700,true);
       Fan f5=new Fan("standard","green",1800,true);
       ArrayList<Fan>fans=new ArrayList<>();
       fans.add(f1);
       fans.add(f2);
       fans.add(f3);
       fans.add(f4);
       fans.add(f5);
       int max=0;
       Fan temp=null;
       for(int i=0; i<fans.size(); i++){
    	   if(fans.get(i).getPrice()>=max){
    		   max=fans.get(i).getPrice();
    		   temp=fans.get(i);
    	   }
       }
       System.out.println(temp);
       
}
}
