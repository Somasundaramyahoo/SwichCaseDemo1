package For1Practies;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="somasundaram";
		String rev="";
		for(int i=name.length()-1; i>=0; i--){
			rev=rev+name.charAt(i);
		}
System.out.println(rev);
	}

}
