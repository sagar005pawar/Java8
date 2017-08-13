package com.Exception;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

class Animal
{
	public void print() throws Exception		//Exception throws from parent clss not from child class
	{
		System.out.println("Animal print");
		throw new SQLException();
//		throw new Exception();				//we are only one thread throwing at a time
	}
	
	@Override
	public String toString() {
		return "Animal";
	}
	
}

class Dog extends Animal
{
	public void print() throws ArrayIndexOutOfBoundsException
	{
//		new ArrayList<String>().get(0);		
		System.out.println("Dog print");
	}
	
	@Override
	public String toString() {
		return "Dog";
	}
}

class Cat extends Animal
{
	public void print() throws ArithmeticException
	{
//		int i=(5/0);
		System.out.println("Cat print");
	}
	
	@Override
	public String toString() {
		return "Cat";
	}
	
}


public class E {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Dog();
		Animal a3 = new Cat();
		try {
			a1.print();
			a2.print();
			a3.print();
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | SQLException e) {
			System.err.println(e);
		} catch (NumberFormatException e) {
			System.err.println("NumberFormatException= " + e);
		} catch (RuntimeException e) {			// final catch block is for Exception not first
			System.err.println("RuntimeException= " + e);		// parent exception catch every time at last	
		} catch (Exception e) {			// final catch block is for Exception not first
			System.err.println("Exception= " + e);		// parent exception catch every time at last	
		} finally {
			System.out.println("finally Block");
		}	
	}
}


/*		
		System.out.println(a1.getClass());
		System.out.println(a1.toString());
		System.out.println(a1.equals(a2));
*/		
