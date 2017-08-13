package com.Static;

public class A {

	static int a=5;
	
	public static void display(){
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		A.display();
	}

}
