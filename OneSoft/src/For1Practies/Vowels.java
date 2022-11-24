package For1Practies;

public class Vowels {
      public static void main(String[] args) {
		String word="example";
		boolean isVowels=true;
		for(int i=0; i<word.length(); i++){
			if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u' ){
				isVowels=false;
			}
		}
		if(isVowels==true){
		System.out.println(word+"  is not contain vowels");
		}
		else if(isVowels==false){
			System.out.println(word+"  is contain vowels");
		}
	}
}
