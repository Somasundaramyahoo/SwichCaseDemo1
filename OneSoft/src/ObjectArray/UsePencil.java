package ObjectArray;

public class UsePencil {
public static void main(String[] args) {
	Pencil p1=new Pencil();
	p1.color="red";
	p1.name="natraj";
	p1.price=5;
	
 Pencil[] pencils={p1};
	for(Pencil p:pencils){
	if(p.name.contains("a") || p.name.contains("e") ||p.name.contains("i") ||p.name.contains("o") ||p.name.contains("u")){
		System.out.println(p1.name+" it's contain vowels");
	}
	}
}
}
