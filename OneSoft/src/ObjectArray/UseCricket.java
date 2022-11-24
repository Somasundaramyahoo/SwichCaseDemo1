package ObjectArray;

public class UseCricket {
public static void main(String[] args) {
	Cricket c1=new Cricket();
	Cricket c2=new Cricket();
	Cricket c3=new Cricket();
	Cricket c4=new Cricket();
	Cricket c5=new Cricket();
	
	c1.isBatsman=true;
	c1.jerseyNo=18;
	c1.name="virat";
	c1.age=34;
	
	c2.isBatsman=false;
	c2.jerseyNo=25;
	c2.name="ashwin";
	c2.age=34;
	
	c3.isBatsman=true;
	c3.jerseyNo=17;
	c3.name="abd";
	c3.age=37;
	
	Cricket[] crickets={c1,c2,c3,c4,c5};
	
	/*for(Cricket c:crickets){
		if(c.isBatsman==true){
			System.out.println(c.jerseyNo+"\n"+c.name+"\n"+c.age);
		}
	}*/
	
	int max=0;
	Cricket maximumAge=null;
	
	for(Cricket c:crickets){
		if(c.age>max){
			max=c.age;
			maximumAge=c;
		}
		
	}
	System.out.println(maximumAge.name);
	
}
}
