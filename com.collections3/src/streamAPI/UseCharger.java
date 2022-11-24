package streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class UseCharger {
	public static void main(String[] args) {
		Charger c1=new Charger("realmi","red",true,500);
		Charger c2=new Charger("mi","white",true,600);
		Charger c3=new Charger("apple","blue",false,700);
		Charger c4=new Charger("vivo","green",true,800);
		Charger c5=new Charger("oppo","black",false,900);
		Charger c6=new Charger("samsung","white",true,1000);
		Charger c7=new Charger("google","black",false,1100);
		
		ArrayList<Charger>a=new ArrayList<>();
		a.add(c1);
		a.add(c2);
		a.add(c3);
		a.add(c4);
		a.add(c5);
		a.add(c6);
		a.add(c7);
		a.stream().filter(x->x.getPrice()>=700).forEach(x->System.out.println(x));
		a.stream().map(y->y.getBrand()).forEach(y->System.out.println(y));
		a.stream().map(x->x.getColor()).forEach(y->System.out.println(y));
		a.stream().filter(x->x.getColor().endsWith("e")).forEach(x->System.out.println(x));
		long number=a.stream().filter(x->x.isCType()==true).count();
		System.out.println(number);
		System.out.println(a.stream().count());
		List<Charger>Ctype=a.stream().filter(x->x.isCType()==true).collect(Collectors.toList());
		Set<Charger>CTypeSet=a.stream().collect(Collectors.toSet());
		Map<String,Charger>mapChargers=a.stream().collect(Collectors.toMap(i->i.getBrand(), j->j));
		System.out.println(Ctype);
		System.out.println(CTypeSet);
		System.out.println(mapChargers);
		List<Charger>na1=a.stream().filter(x->x.isCType()==true).collect(Collectors.toList());
		na1.forEach(x->System.out.println(x.getBrand()+", "+(x.getPrice()-100)+", "+x.getColor()));
		
		
		
	}
}  