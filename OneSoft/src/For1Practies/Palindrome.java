package For1Practies;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="madam";
		String rev="";
		for(int i=name.length()-1; i>=0; i--){
			rev=rev+name.charAt(i);
		}
if(name.equals(rev)){ 
	System.out.println(name+"  is palindrome");
}
else{
	System.out.println(name+"  is not a palindrom");
}

	}

}
