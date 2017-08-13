package com.OOPs;

//Simple example of Covariant Return Type
class A1{  
	A1 get(){return this;}  
}  
  
public class B1 extends A1{  
	B1 get(){return this;}  
	void message(){System.out.println("welcome to covariant return type");}  
	  
	public static void main(String args[]){  
		new B1().get().message();  
	}  
}  

/*
	since Java5, it is possible to override method by changing
	the return type if subclass overrides any method whose return type is Non-Primitive
	but it changes its return type to subclass type.
*/
