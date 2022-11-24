package examples;

public class IndexOutOfBoundsDemo {
	public static void main(String[] args) {
		int[] a={1,2,3,4,5};
		try{
			System.out.println(a[5]);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("IndexOutOfBoundsException");
		}
		System.out.println("end");
	}

}
