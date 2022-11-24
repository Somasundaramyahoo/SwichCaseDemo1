package For1Practies;

public class OddEvenCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countodd=0;
		int counteven=0;
		for(int i=1; i<=10; i++){
			if(i%2==0){
				counteven++;
			}
			else{
				countodd++;
			}
		}
		System.out.println("even count is "+counteven);
		System.out.println("odd count is "+countodd);

	}

}
