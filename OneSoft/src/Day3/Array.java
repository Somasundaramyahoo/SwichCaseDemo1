package Day3;

public class Array {

	public static void main(String[] args) {
		String a="helloeandehii";
		char b[]=a.toCharArray();
		System.out.println(b[0]+" , "+b[1]+" , "+b[2]+" , "+b[3]+" , "+b[4]);
		
		System.out.println();

	    String c="hellotellsomthingl";
		String e[]=c.split("l");
		System.out.println(e[0]+" , "+e[1]+" , "+e[2]+" , "+e[3]+" , "+e[4]);
		
System.out.println(c.endsWith("l"));
String x="ab,ac,ad";
String y[]=x.split(",");
System.out.println(y[0]+" "+y[1]);


	}

}
