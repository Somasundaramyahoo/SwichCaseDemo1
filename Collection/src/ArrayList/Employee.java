package ArrayList;

public class Employee {
	private String name,designation;
	private int id,salary;
	
	Employee(String name,String designation,int id,int salary){
		this.name=name;
		this.designation=designation;
		this.id=id;
		this.salary=salary;
	}
	void setName(String name){
		this.name=name;
	}
	String getName(){
		return name;
	}
	void setDesignation(String designation){
		this.designation=designation;
	}
	String getDesignation(){
		return designation;
	}
	void setId(int id){
		this.id=id;
	}
	int getId(){
		return id;
	}
	void setSalary(int salary){
		this.salary=salary;
	}
	int getSalary(){
		return salary;
	}
	public String toString(){
		return "name = "+name+", "+"designation = "+designation+", "+"id is= "+id+", "+"salary is = "+salary;
	}

}
