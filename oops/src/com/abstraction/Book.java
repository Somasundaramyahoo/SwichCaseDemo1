package com.abstraction;

public abstract class Book {
public abstract void printPrice(int price);
public abstract void printAuthers(String autherName);
public void printBookPublicators(){
	System.out.println("Oxford publications");
}
}
