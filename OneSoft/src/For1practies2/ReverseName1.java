package For1practies2;

public class ReverseName1 {
public static void main(String[] args) {
	String name="lecry";
	String rev="";
	for(int i=name.length()-1; i>=0; i--){
		rev=rev+name.charAt(i);
	}
System.out.println(rev);
if(name.equals(rev)){
	System.out.println(name+"  is palindrome");
}
else if(name!=rev){
	System.out.println(name+"  is not palindrome");
}
}
}