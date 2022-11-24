package LMScondition;

public class Demo {
 public static void main(String[] args) {
	String b=args[0];
	char a=b.charAt(0);
	if(b.equals('n'))
		System.out.println("north");
	else if (b.equals("e"))
		System.out.println("east");
	else
		System.out.println("north");
}
}
