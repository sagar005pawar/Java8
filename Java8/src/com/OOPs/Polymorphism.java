package com.OOPs;

import java.util.*;

class Superclass
{
	public void show(int i, int j){
		System.out.println("int i, int j");
	}
	public void show(int i, int j, int k){
		System.out.println("int i, int j, int k");
	}
	public void show(float i, float j){
		System.out.println("float i, float j");
	}
	public void show(int i, float j){
		System.out.println("int i, float j");
	}
	public void show(float i, int j){
		System.out.println("float i, int j");
	}
	public void show(float i, float j, float k){
		System.out.println("float i, float j, float k");
	}

	public void show(long i, double j) {
		System.out.println("long i, double j");
	}
	
	public String print() {
		return "Super-Class";
	}
	
	public void getId(Object o){
		System.out.println("Object");
	}

	public void getId(String s){
		System.out.println("String");
	}
	
}

class Subclass extends Superclass
{

	public String print(){
		return "Sub-Class";
	}
	
}

public class Polymorphism {
	
	public static void main(String[] args) {
		
		Superclass s2 = new Subclass();
		System.out.println(s2.print());
		
		s2.getId(null);			//providing object value null
		//String is subclass of object thats why subclass method called
		
		
/*		
		//Overloading:- Method overloading increases the readability of the program.
		Superclass s1 = new Superclass();
		s1.show(4.0f, 3.0f);
		s1.show(4, 3.0f);
		s1.show(4.0f, 3);
		s1.show(4, 3);
		s1.show(4.0f, 3.0f, 5.0f);
		s1.show(4, 3, 5);	
*/
		/*
		 * In java, Method Overloading is not possible by changing the return type of the method only.
		
		Different ways to overload the method

		There are two ways to overload the method in java
		
		By changing number of arguments
		By changing the data type
		*/

		
	}
	
	public static void main(String args) {
		Product p1 = new Product(1, "sagar", 25.5f);
		Product p2 = new Product(2, "vijay", 15.5f);
		Product p3 = new Product(3, "pawar", 40.0f);
		
		List<Product> list = new ArrayList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		list.forEach(System.out::println);
		
		
	}
}
