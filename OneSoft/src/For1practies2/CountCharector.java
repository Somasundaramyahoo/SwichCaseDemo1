package For1practies2;

public class CountCharector {
public static void main(String[] args) {
	String mail="SomaSundramKRP143@gamil.com";
	int upperCount=0, lowerCount=0, numberCount=0, charCount=0;
	for(int i=0; i<=mail.length()-1; i++){
		if(mail.charAt(i)>='A' && 'Z'>=mail.charAt(i)){
			upperCount++;
		}
		else if(mail.charAt(i)>='a' && 'z'>=mail.charAt(i)){
			lowerCount++;
		}
		else if(mail.charAt(i)>='0' && '9'>=mail.charAt(i)){
			numberCount++;
		}
		else{
			charCount++;
		}
	}
	System.out.println("upper count is = "+upperCount+"\nlower count is = "+lowerCount+"\nnumber count is = "+numberCount+"\nchartector count is = "+charCount);
}
}
