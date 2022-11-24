package ObjectArray;

public class UsePen {
public static void main(String[] args) {
	Pen p1=new Pen();
	Pen p2=new Pen();
	Pen p3=new Pen();
	Pen p4=new Pen();
	Pen p5=new Pen();
	
	p1.color="blue";
	p1.isRefill=true;
	p1.name="luxer";
	p1.tipWidth=0.3f;
	
	p2.color="red";
	p2.isRefill=true;
	p2.name="parker";
	p2.tipWidth=0.2f;
	
	p3.color="blue";
	p3.isRefill=true;
	p3.name="hero";
	p3.tipWidth=0.5f;

	p4.color="green";
	p4.isRefill=true;
	p4.name="abc";
	p4.tipWidth=0.4f;
	
	p5.color="blue";
	p5.isRefill=true;
	p5.name="xyz";
	p5.tipWidth=0.3f;
	
	Pen[] pens={p1,p2,p3,p4,p5};
	int count=0;
	
	for(Pen p:pens){
		if(p.color.equals("blue")){
			count++;
		}
	}
	System.out.println("blue pens count is = "+count);
}
}
