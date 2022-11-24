package Day3;

public class Demo1 {
	public static void main(String[] args) {
       String a="hello somu";
	  char b=a.charAt(a.length()-1);
		System.out.println(b);
		
		String c=a.substring(2,a.length()-1);
		int e=a.substring(2,a.length()-1).length();
		System.out.println(e);
		
		    String d=a.substring(0,1);
		    System.out.println(d.toUpperCase().concat(a.substring(1)));
		
	}

}