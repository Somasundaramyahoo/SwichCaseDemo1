package For2Practies;

public class PrintString {
    public static void main(String[] args) {
		String[] names={"somu","sundaram","ramu","raju","ram","prem"};
		for(int i=0; i<names.length; i++){
			System.out.println(names[i]);
		}
		String[] words=new String[5];
		words[0]="somu";
		words[1]="xyz";
		words[2]="abcd";
		words[3]="sundaram";
		words[4]="ramu";
		System.out.println();
		for(int i=words.length-1; i>=0; i--){
		System.out.println(words[i]);
		}
		
	}
}
