 package For2Practies;

public class OddEven {
    public static void main(String[] args) {
		int[] nums={1,2,3,4,5,6,7,8,9};
		for(int i=0; i<nums.length; i++){
			if(nums[i]%2==0)
				System.out.println(nums[i]+" is even number");
			else
				System.out.println(nums[i]+" is odd number");
		}
	}
}
