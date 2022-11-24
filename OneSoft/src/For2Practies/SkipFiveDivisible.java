package For2Practies;

public class SkipFiveDivisible {
     public static void main(String[] args) {
		int[] nums={3,5,9,10,13,15,18};
		for(int i=0; i<nums.length; i++){
			if(nums[i]%5==0){
				continue;	
			}
				System.out.println(nums[i]);
		}
	}
}
