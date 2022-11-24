package functionRevision;

public class FindUpperNumber {
public static void main(String[] args) {
	String word="So1m2U3TeC4h";
	int countUpper=0;
	int countLower=0;
	int countNumber=0;
	for(int i=0; i<word.length(); i++){
		if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
			countUpper++;
		}
		else if(word.charAt(i)>='a' && word.charAt(i)<='z'){
			countLower++;
		}
		else if(word.charAt(i)>='0' && word.charAt(i)<='9'){
			countNumber++;
			
		}
	}
	System.out.println("lower  count is  " +countLower);
	System.out.println("upper  count is  " +countNumber);
	System.out.println("number  count is  " +countUpper);
}
}
