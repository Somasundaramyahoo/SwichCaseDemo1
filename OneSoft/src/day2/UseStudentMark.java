package day2;

public class UseStudentMark {

	public static void main(String[] args) {
	  StudentMark s= new StudentMark();
	  StudentMark s1=new StudentMark();
	  StudentMark s2= new StudentMark();
	  s.tamil=95;
	  s.english=88;
	  s.maths=98;
	  s.science=95;
	  s.social=96;
	  s.indAvg=(s.tamil+s.english+s.maths+s.science+s.social)/5;
	  s.total=(s.tamil+s.english+s.maths+s.science+s.social);
	  System.out.println("Student s total mark is ="+ s.total);
	  System.out.println("individual average s = "+s.indAvg);
	  s1.tamil=92;
	  s1.english=86;
	  s1.maths=95;
	  s1.science=92;
	  s1.social=93;
	  s1.indAvg=(s1.tamil+s1.english+s1.maths+s1.science+s1.social)/5;
	  s1.total=(s1.tamil+s1.english+s1.maths+s1.science+s1.social);
			  System.out.println("Student s1 total mark is ="+ s1.total);
			  System.out.println("individual average s1 = "+s1.indAvg);
	  s2.tamil=98;
	  s2.english=82;
	  s2.maths=91;
	  s2.science=97;
	  s2.social=93;
	  s2.indAvg=(s2.tamil+s2.english+s2.maths+s2.science+s2.social)/5;
	  s2.total=(s2.tamil+s2.english+s2.maths+s2.science+s2.social);
	  System.out.println("Student s2 total mark is ="+ s2.total);
	  System.out.println("individual average s2 = "+s2.indAvg);
	  int classTotal= s.total+s1.total+s2.total;
	  System.out.println("class total mark is = "+classTotal);
	  int classAvg=(classTotal/3);
	  System.out.println("class average is = "+classAvg);
	}

}
