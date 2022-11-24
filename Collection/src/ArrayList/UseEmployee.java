package ArrayList;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("somu", "CEO", 11, 500000);
		Employee e2 = new Employee("sundaram", "mager", 12, 400000);
		Employee e3 = new Employee("rahul", "HR", 13, 300000);
		Employee e4 = new Employee("kowshik", "supervisor", 14, 10000);
		Employee e5 = new Employee("livya", "inspector", 15, 40000);
		Employee e6 = new Employee("raji", "inspector", 16, 40000);
		Employee e7 = new Employee("jaya", "operator", 17, 20000);
		Employee e8 = new Employee("sathya", "operator", 18, 20000);
		Employee e9 = new Employee("ramya", "operator", 19, 20000);
		Employee e10 = new Employee("pooja", "operator", 20, 20000);

		ArrayList<Employee> emp = new ArrayList<>();
		//emp.add(new Employee("somu", "CEO", 11, 500000);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		emp.add(e7);
		emp.add(e8);
		emp.add(e9);
		emp.add(e10);
		// for loop
		/*for (int i = 0; i < emp.size(); i++) {
			
			System.out.println(emp.get(i));
		}
		// Enhanced for loop
		for (Employee e : emp) {
			System.out.println(e);
		}
		// for each
		emp.forEach((x) -> System.out.println(x));
		//for loop if condition
		int max = 0;
		Employee x = null;
		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).getSalary() >= max) {
				max =emp.get(i).getSalary() ;
				x = emp.get(i);
			}
		}*/
		//System.out.println(x);
		ArrayList <Employee> designation =new ArrayList<>();
		for(Employee d:emp){
			if(d.getDesignation().equalsIgnoreCase("CEO")){
				designation.add(d);
			}
		}
		System.out.println(designation);
	}
}
m