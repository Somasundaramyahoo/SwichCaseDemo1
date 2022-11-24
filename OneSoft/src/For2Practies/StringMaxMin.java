
package For2Practies;

public class StringMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String[] names={"somu","sundaram","ramu","raju","ram","som"};
         String max=names[0];
         String min=names[0];
         for(int i=0; i<names.length; i++){
        	 if(names[i].length()>=max.length())
    			 max=names[i];
         }
         System.out.println(max);
         for(int i=0; i<names.length; i++){
        	 if(names[i].length()<=min.length())
    			 min=names[i];
         }
         System.out.println(min);
	}

}
