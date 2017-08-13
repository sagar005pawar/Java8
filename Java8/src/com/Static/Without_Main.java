package com.Static;

public class Without_Main {
	  static{  
		  System.out.println("static block is invoked");  
		  System.exit(0);  
	  }  	
}
/* 

	Output:static block is invoked (if not JDK7)
	
	In JDK7 and above, output will be:
	Output:Error: Main method not found in class A3, please define the main method as:
	public static void main(String[] args)

*/