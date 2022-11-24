import java.util.Scanner;

public class ForDemo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
			System.out.println("please enter the number");
	 int n=scan.nextInt();
	 int i=1;
	 do
	 {
		 System.out.println("natural numbers :"+i);
		 i++;
	 } 
	 while(i<=n);
}
}
