package functions;

public class Sample {
	public int findFactorial(int a){
		int mul=1;
		for(int i=1; i<=a ; i++){
			mul*=i;
		}
		return mul;
	}
	public String checkOdd(int a){
		if(a%2!=0){
		 return "it is odd number";
		}
		return "it is even number";
	}
	public void reverseString(String a){
		String rev="";
		for(int i=a.length()-1; i>=0; i--){
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
	}
	public void checkPrime(int a){
		boolean isPrime=true;
		for(int i=2; i<a ; i++){
			if(a%i==0){
				isPrime=false;
			}
		}
			if(isPrime==false){
				System.out.println("it is not prime number");
			}
			else{
		System.out.println("it is prime number");
	}
	}
}
