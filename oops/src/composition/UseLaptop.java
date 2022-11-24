package composition;

public class UseLaptop {
public static void main(String[] args) {
	MotherBoard mb=new MotherBoard();
	MotherBoard mb2=new MotherBoard();
   mb.brand="abc";
   mb.price=2000;
   mb2.brand="xyz";
   mb2.price=5000;
   Laptop l=new Laptop();
   Laptop l2=new Laptop();
   Laptop l3=new Laptop();
   l.brand="lenova";
   l.color="blue";
   l.price=35000;
   l.motherBoard=mb;
   l2.brand="apple";
   l2.color="red";
   l2.price=70000;
   l2.motherBoard=mb2;
   l3.brand="hp";
   l3.color="blue";
   l3.price=33000; 
   l3.motherBoard=mb;
   System.out.println("lenova details : "); 
   System.out.println(l.brand+", "+l.price+", "+l.color+", "+l.motherBoard.brand+", "+l.motherBoard.price);
   System.out.println("apple detais : ");
   System.out.println(l2.brand+", "+l2.price+", "+l2.color+", "+l2.motherBoard.brand+", "+l2.motherBoard.price);
   
   System.out.println("hp details : ");
   System.out.println(l3.brand+", "+l3.price+", "+l3.color+", "+l3.motherBoard.brand+", "+l3.motherBoard.price);
   
}
}
