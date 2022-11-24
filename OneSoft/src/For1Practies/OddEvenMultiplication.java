package For1Practies;

public class OddEvenMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odd=1;
		int even=1;
		int count =0;
		for(int i=1; i<=10; i++){
			if(i%2==0) {
				even=even*i;
				count++;
		}
			
			else {
				odd=odd*i;
			}	
		}
		System.out.println(" even number multiplication is  "+even);
		System.out.println(" odd number multiplication is  "+odd);
		System.out.println(" count is "+count);
	}

}
