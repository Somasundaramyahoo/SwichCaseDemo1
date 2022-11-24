package oopsPracties;

public class Student {
  String name,department;
  int id;
  public Student(String name,String department,int id){
	  this.name=name;
	  this.department=department;
	  this.id=id;  
  }
  public String toString(){
	  return "st name = "+name+",  st department is = "+department+", st id is = "+id;
  }
}
