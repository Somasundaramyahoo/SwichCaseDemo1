package functionRevision;

public class FindConsonans {
public static void main(String[] args) {
	String word="example";
	String temp="";
	for(int i=0; i<word.length(); i++){
		if(word.charAt(i)!='a' && word.charAt(i)!='e' && word.charAt(i)!='i' && word.charAt(i)!='o' && word.charAt(i)!='u' ){
			temp=temp+word.charAt(i);
			
		}
	}
	System.out.println(temp);
}
}
