package For2Practies;

public class FindCount {
   public static void main(String[] args) {
	int[] nums={1,2,3,4,4,6,7,8};
	int counteven=0;
	int countodd=0;
	for(int i=0; i<nums.length; i++)
		if(nums[i]%2==0)
			counteven++;
		
		else
			countodd++;
		
	
	System.out.println("odd count is "+countodd);
	System.out.println("even count is "+counteven);
}
}
