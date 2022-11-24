package For1practies2;

public class PrimeNumber2 {
public static void main(String[] args) {
	int num=11;
	boolean isPrime=true;
	for(int i=2; i<num; i++){
		if(num%i==0){
			isPrime=false;
		}
		
	}
	if(isPrime==true){
		System.out.println(num+"  is prime number ");
	}
	else{
		System.out.println(num+"  is not a prime number");
	}
}
}
