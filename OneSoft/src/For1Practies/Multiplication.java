package For1Practies;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mul=1;
		for (int i = 1; i <=7 ; i++) {
			System.out.println(mul*i);
			mul = mul * i ;
		}
		System.out.println(" multiplication value is = " + mul);
	}

}
