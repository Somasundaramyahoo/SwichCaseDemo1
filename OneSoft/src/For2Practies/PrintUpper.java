package For2Practies;

public class PrintUpper {
    public static void main(String[] args) {
		String[] names={"HELLOW","world","ROBOT","here"};
		for(int i=0; i<names.length; i++){
			if(names[i]==names[i].toUpperCase()){
				System.out.println(names[i]);
			}
			//else
				//System.out.println(names[i]);
		}
		
	}
}
