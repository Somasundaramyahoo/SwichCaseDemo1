package ObjectArray;

public class UseStudent {
public static void main(String[] args) {
	Student s1=new Student();
	Student s2=new Student();
	Student s3=new Student();
	
	s1.age=12;
	s1.isPresent=true;
	s1.name="somu";
	s1.mobileNo="8838993020";
	s1.rollNo=12;
	
	s2.age=13;
	s2.isPresent=true;
	s2.name="sundaram";
	s2.mobileNo="7258845410";
	s2.rollNo=44;
	
	s3.age=11;
	s3.isPresent=true;
	s3.name="thalapathy";
	s3.mobileNo="9876543210";
	s3.rollNo=21;
	 
	Student[] students={s1,s2,s3};
	
	for(Student s:students){
		if(s.rollNo>=1 && s.rollNo<=20){
			System.out.println(s.name+"  is 'A' section ");			
		}
		else if(s.rollNo>=21 && s.rollNo<=40){
			System.out.println(s.name+"  is 'B' section ");
		}
		else if(s.rollNo>=41 && s.rollNo<=60){
			System.out.println(s.name+"  is 'C' section ");
		}
	}
}
}
