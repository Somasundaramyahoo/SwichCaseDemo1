package For2Practies;

public class FindVowelCount {
     public static void main(String[] args) {
		String[] names={"somu","sundaram","nayanthara","samantha"};
		  String max=names[0];
	         for(int i=0; i<names.length; i++){
	        	 if(names[i].length()>=max.length())
	    			 max=names[i];
	         }
	         System.out.println(max);
	         char[] letters=max.toCharArray();
	         int count=0;
	         for(int i=0; i<letters.length; i++){
	        	 if(letters[i]=='a' || letters[i]=='e' ||letters[i]=='i'||letters[i]=='o'||letters[i]=='u' ){
	 				
	     			count++;
	         }
	        	
	         }
	         System.out.println(" vowel count is "+count);
	}
}
