package functions;

public class PrintString {
        public void findUpperCase(String a[]){
        	for(int i=0; i<a.length; i++){
        		if(a[i].toUpperCase().equals(a[i])){
        			System.out.println(a[i]+"is upper case");
        		}
        	}
        }
        public int findUpperCaseCount(String names[]){
        	int count=0;
        	for(int i=0; i<names.length; i++){
        		count++;
        	}
        	return count;
        }
}
