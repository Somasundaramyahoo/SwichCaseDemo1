package oopsPracties;

public class Human1 {
String name;
int age;
String fatherName;

Human1 (String name,int age,String fatherName){
	this.name=name;
	this.age=age;
	this.fatherName=fatherName;
}
public String toString(){
	return name+", "+age+", "+fatherName;
}
}
