package functions;

public class UsePrintString {
public static void main(String[] args) {
	String[] names={"HELLOW","world","ROBOT","here","NICE","to","MEET","you"};
	PrintString p=new PrintString();
	p.findUpperCase(names);
	System.out.println(p.findUpperCaseCount(names));
}
}
