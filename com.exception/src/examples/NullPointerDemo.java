package examples;

public class NullPointerDemo {
	public static void main(String[] args) {
		String a=null;
		System.out.println("start");
		try{
			System.out.println(a.length());
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException");
			//System.out.println("error occurs");
		}
		System.out.println("end");
	}

}
