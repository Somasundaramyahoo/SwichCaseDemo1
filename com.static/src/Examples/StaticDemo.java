package Examples;

public class StaticDemo {
	static int a=10;
	int b= 10;
	public void find(){
		a++;
		b++;
		System.out.println(a);
		System.out.println(b);	
	}
	public static void main(String[] args) {
		StaticDemo s1=new StaticDemo();
		StaticDemo s2=new StaticDemo();
		StaticDemo s3=new StaticDemo();
		
		s1.find();
		s1.find();
		s1.find();
		s2.find();
		s2.find();
		s3.find();
		
	}

}
