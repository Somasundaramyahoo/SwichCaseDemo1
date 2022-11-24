package day4;

public class Contains4 {
public static void main(String[] args) {
	int a=13;
	if(a<=4){
		System.out.println("early morning");
	}
	else if(a>=5 && a<=12){
		System.out.println("morning");
	}
	else if(a>=13 && a<=15){
		System.out.println("afternoon");
	}
	else if(a>=16 && a<=18){
		System.out.println("evening");
	}
	else if(a>=19 && a<=24){
		System.out.println("mid night");
	}
}
}
