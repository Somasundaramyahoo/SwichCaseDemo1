package For2Practies;

public class VowelsArray {
     public static void main(String[] args) {
		String name="example";
		char[] letters=name.toCharArray();
		for(int i=0; i<letters.length; i++){
			if(letters[i]=='a' || letters[i]=='e' ||letters[i]=='i'||letters[i]=='o'||letters[i]=='u' ){
				System.out.println(letters[i]);
			}
		}
	}
}
