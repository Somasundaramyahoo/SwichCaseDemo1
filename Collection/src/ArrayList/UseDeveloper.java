package ArrayList;

import java.util.ArrayList;

public class UseDeveloper {
	public static void main(String[] args) {
		Developer d1=new Developer("somu","javaDeveoper",true,40000,3);
		Developer d2=new Developer("sundaram","javaDeveoper",true,45000,6);
		Developer d3=new Developer("raju","javaDeveoper",true,48000,5);
		Developer d4=new Developer("livya","C++Deveoper",false,39000,3);
		Developer d5=new Developer("ragul","SqlDeveoper",false,44000,4);
		Developer d6=new Developer("kowshik","PythonDeveoper",false,25000,2);
		ArrayList<Developer>a=new ArrayList<>();
		a.add(d1);
		a.add(d2);
		a.add(d3);
		a.add(d4);
		a.add(d5);
		a.add(d6);
		int max=0;
		Developer b=a.get(0);
		for(int i=0; i<a.size(); i++){
			if(a.get(i).getSalary()>=max){
				max=a.get(i).getSalary();
				b=a.get(i);
			}
		}
		System.out.println(b);
		for(Developer c:a){
			 System.out.println(c.getName().toUpperCase());
			 System.out.println(c.getWork().toUpperCase());
		}
		ArrayList<Developer>javaDeveloper=new ArrayList<>();
		ArrayList<Developer>notJavaDeveloper=new ArrayList<>();
		a.forEach(x->{
			if(x.getIsJavaDeveloper()==true){
				javaDeveloper.add(x);
			}
			else{
				notJavaDeveloper.add(x);
			}
		});
		System.out.println();
		System.out.println(javaDeveloper);
		System.out.println(notJavaDeveloper);
		for(int i=0; i<a.size(); i++){
			System.out.println(a.get(i).getExperiance()+2);
		}
	}

}
 