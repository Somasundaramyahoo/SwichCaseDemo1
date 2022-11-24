package LMSpracties;

public class LongTest {
public static void main(String[] args) {
	Door door=new Door();
	String arr[]=args[0].split(",");
	door.color=arr[0];
	door.material=arr[1];
	door.isSmart=Boolean.parseBoolean(arr[2]);
	System.out.println(door.color+" "+door.material+" "+door.isSmart);
}
}
class Door{
	String color;
	String material;
	boolean isSmart; 
}
