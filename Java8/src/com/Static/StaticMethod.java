package com.Static;

public class StaticMethod {

	public static void print() {
		System.out.println("static method..");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main Method...");
	}
	
	static {
		System.out.println("static block..");
		print();
	}
	
}


