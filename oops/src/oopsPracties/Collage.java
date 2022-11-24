package oopsPracties;

public class Collage {
private String name,location;
private int noOfbranch;
private boolean isEngineering;
public Student student;

public void setName(String name){
	this.name=name;
}
public String getName(){
	return name;
}
public void setLocation(String location){
	this.location=location;
}
public String getLocation(){
	return location;
}
public void setnoOfbranch(int noOfbranch){
	this.noOfbranch=noOfbranch;
}
public int getnoOfbranch(){
	return noOfbranch;
}
public void setIsEngineering(boolean isEngineering){
	this.isEngineering=isEngineering;
}
public boolean getIsEngineering(){
	return isEngineering;
}
public Collage(String name,String location,int noOfbranch,boolean isEngineering){
	this.name=name;
	this.location=location;
	this.noOfbranch=noOfbranch;
	this.isEngineering=isEngineering;
}
public String toString(){
	return "name = "+name+", location = "+location+", no of branch = "+noOfbranch+", is engineering = "+true;
}
}

