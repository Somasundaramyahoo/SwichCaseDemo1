package functionRevision;

public class PositiveNegative {
public static void main(String[] args) {
	int[] num=new int[8];
	num[0]=5;
	num[1]=15;
	num[2]=10;
	num[3]=-44;
	num[4]=36;
	num[5]=-12;
	num[6]=18;
	num[7]=-9;
	for(int i=0; i<num.length; i++){
		if(num[i]>=0){
			System.out.println(num[i]+" is positive number");
		}
		else{
			System.out.println(num[i]+" is negative number");
		}
	}
}
}
