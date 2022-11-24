package com.oops.concepts.encapsulation;

public class StudentApp
{
 public static void main(String[] args)
{
	Studen s=new Studen(101,"somu");
    System.out.println("Name : "+s.getName());
    System.out.println("Roll : "+s.getRoll());
}


}
class Studen
{
private int roll;
private String name;
public Studen(int r,String n)
{
	roll=r;
	name=n;
}
public int getRoll()
{
	return roll;
}
public String getName()
{
	return name;
}
}
