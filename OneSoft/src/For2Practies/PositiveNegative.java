package For2Practies;

public class PositiveNegative {
     public static void main(String[] args) {
		int[] nums=new int[8];
		nums[0]=10;
		nums[1]=-10;
		nums[2]=20;
		nums[3]=-15;
		nums[4]=36;
		nums[5]=-23;
		nums[6]=32;
		nums[7]=17;
		for(int i=0; i<nums.length; i++){
			if(nums[i]>0)
				System.out.println(nums[i]+" is positive value");
			else
				System.out.println(nums[i]+" is negative value");
		}
	}
}
