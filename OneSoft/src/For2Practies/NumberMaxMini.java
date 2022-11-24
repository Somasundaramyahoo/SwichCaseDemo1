package For2Practies;

public class NumberMaxMini {
public static void main(String[] args) {
	int[] nums=new int[8];
	nums[0]=10;
	nums[1]=20;
	nums[2]=30;
	nums[3]=90;
	nums[4]=50;
	nums[5]=60;
	nums[6]=70;
	nums[7]=80;
	 int max=nums[0];
	 int min=nums[0];
	 for(int i=0; i<nums.length; i++){
		 if(nums[i]>=max)
			 max=nums[i];
	 }
	 System.out.println(" the maximum value is = "+max);
	 for(int i=0; i<nums.length; i++){
		 if(nums[i]<=min)
			 min=nums[i];
	 }
	 System.out.println(" the minimum value is = "+min);
	}
}
