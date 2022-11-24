package streamAPI;

public class Teacher {
	String name,qualification;
	int age,salary;
	boolean isMale;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public Teacher(String name, String qualification, int age, int salary, boolean isMale) {
		this.name = name;
		this.qualification = qualification;
		this.age = age;
		this.salary = salary;
		this.isMale = isMale;
	}
	public String toString(){
		return name+", "+qualification+", "+age+", "+salary+", "+isMale;
	}
	
    
}
