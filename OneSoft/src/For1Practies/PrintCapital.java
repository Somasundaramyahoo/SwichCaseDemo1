package For1Practies;

public class PrintCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="ExAmpLE";
		String upper=word.toUpperCase();
		for(int i=0; i<word.length(); i++){
			if(word.charAt(i)==upper.charAt(i)){
				System.out.println("  "+word.charAt(i));
			}
			else if(word.charAt(i)!=upper.charAt(i)){
				System.out.println("  "+word.charAt(i));
			}
		}

	}

}
