package For1practies2;

public class Average {
	public static void main(String[] args) {
		int res=0;
		int count=0;
		for(int i=100; i>=50; i--){
			res=res+i;
			count++; 
		}
		System.out.println(res/count);
	}

}
