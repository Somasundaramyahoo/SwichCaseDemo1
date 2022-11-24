package ArrayList;

public class Developer {
String name,work;
boolean isJavaDeveloper;
int salary,experiance;

void setName(String name){
	this.name=name;
	
}
String getName(){
	return name;
}
void setWork(String work){
	this.work=work;
}
String getWork(){
	return work;
}
void setIsJavaDeveloper(boolean isJavaDeveloper){
  this.isJavaDeveloper=isJavaDeveloper;
}
boolean getIsJavaDeveloper(){
	return isJavaDeveloper;
}
void setSalary(int salary){
	this.salary=salary;
}
int getSalary(){
	return salary;
}
void setExperiance(int experiance){
	this.experiance=experiance;
}
int getExperiance(){
	return experiance;
}
Developer (String name,String work,boolean isJavaDeveloper,int salary,int experiance){
	this.name=name;
	this.work=work;
	this.isJavaDeveloper=isJavaDeveloper;
	this.salary=salary;
	this.experiance=experiance;
}
public String toString(){
	return name+",  "+work+",  "+isJavaDeveloper+",  "+salary+",  "+experiance;
}
}
