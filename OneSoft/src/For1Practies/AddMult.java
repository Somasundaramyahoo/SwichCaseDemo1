package For1Practies;

public class AddMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odd=0;
		int even=0;
		for(int i=1; i<=10; i++){
			if(i%2==0)
				odd=odd+i;
			else
				even=even+i;
		}
		System.out.println(" odd number addition is "+odd);
		System.out.println("even number addition is "+even);
				

	}

}
