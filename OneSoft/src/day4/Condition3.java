package day4;

public class Condition3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=18;
		 if (a<20){
			 System.out.println("temp is high");
		 }
		 else if (a>=21 && a<=25){
			 System.out.println("temp is medium");
		 }
		 else if (a>=26 && a<=29){
			 System.out.println("temp is low");
		 }
		 else{
			 System.out.println("switch off the AC");
		 }
	}

}
