package oopsPracties;

public class UseFan {
public static void main(String[] args) {
	Motor m=new Motor(700,200);
	Fan f=new Fan("usha",2000,true);
	System.out.println("fan details : ");
	System.out.println(f);
	System.out.println("motor details : ");
	System.out.println(m);
}
}
