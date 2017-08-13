package com.InnerClass;

//Example of nested interface which is declared within the interface
interface Showable
{  
	void show();  
	interface Message{  
		void msg();  
	}  
}  

public class TestNestedInterface1 implements Showable.Message{  
	 public void msg(){System.out.println("Hello nested interface");}  
	  
	 public static void main(String args[]) {  
		 Showable.Message message=new TestNestedInterface1();//upcasting here  
		 message.msg();  
	 }  
}  


