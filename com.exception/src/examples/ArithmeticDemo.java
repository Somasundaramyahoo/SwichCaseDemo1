package examples;

public class ArithmeticDemo {
	public static void main(String[] args) {
		System.out.println("start");
		int a=10;
		int b=0;
		try{
		System.out.println(a/b);
		}
		catch(Exception e){
			System.out.println("Arithmetic Exception"); 
		}
		System.out.println("end");
	}

}
