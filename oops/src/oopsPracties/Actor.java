package oopsPracties;

public class Actor extends Human1 {
 int noOfMovies;
 int salary;

 Actor (String name,int age,String fatherName, int noOfMovies,int salary){
	 super(name,age,fatherName);
	 this.noOfMovies=noOfMovies;
	 this.salary=salary;
 }
 public String toString(){
	 return super.toString()+", "+noOfMovies+", "+salary;
 }
 

}
