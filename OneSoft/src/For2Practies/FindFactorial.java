package For2Practies;

public class FindFactorial {
   public static void main(String[] args) {
	int[] nums={1,2,3,4,5,6,7};
	 int max=nums[0];
	 for(int i=0; i<nums.length; i++){
		 if(nums[i]>=max)
			 max=nums[i];
	 }
	 System.out.println("  large number is  "+max);
	 int mul=1;
		for (int i = 1; i <=max; i++) {
			
			mul = mul * i ;
		}
		System.out.println(max+" factorial value is = " + mul);
	}
}
