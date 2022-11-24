package streamAPI;

import java.util.List;
import java.util.HashMap;
import java.util.stream.Collectors;

public class UseTeacher {
	public static void main(String[] args) {
		Teacher t1=new Teacher("somu","b.e",23,60000,true);
		Teacher t2=new Teacher("sundaram","m.sc",27,58000,true);
		Teacher t3=new Teacher("ramya","m.a",24,55000,false);
		Teacher t4=new Teacher("ragul","m.ed",21,70000,true);
		Teacher t5=new Teacher("raji","m.ed",23,44000,false);
		Teacher t6=new Teacher("livya","b.sc",25,40000,false);
		Teacher t7=new Teacher("kowsik","m.a",26,11000,true);
		HashMap<Integer,Teacher>a=new HashMap<>();
		a.put(1,t1);
		a.put(2,t2);
		a.put(3,t3);
		a.put(4,t4);
		a.put(5,t5);
		a.put(6,t6);
		a.put(7,t7);
		List<String>name=a.values().stream().map(x->x.getName()).collect(Collectors.toList());
		System.out.println(name);
		List<Integer>maxAge=a.values().stream().filter(x->x.getAge()>=25).map(x->x.getSalary()).collect(Collectors.toList());                                                 
		System.out.println(maxAge);
		List<String>highName=a.values().stream().filter(x->x.getSalary()>=55000).filter(x->x.getQualification().equalsIgnoreCase("m.sc")).map(x->x.getName()).collect(Collectors.toList());                                                 
		System.out.println(highName);
		List<String>techDetails=a.values().stream().map(x->x.getQualification()).filter(x->x.startsWith("m")).collect(Collectors.toList());
		System.out.println(techDetails);	
	}
}