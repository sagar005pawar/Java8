package com.Reflection;

import java.lang.reflect.Method;

class Simple
{
	 void message(){System.out.println("Hello Java");}  	
	 private void message1(){System.out.println("hello java"); }  
	 private void cube(int n){System.out.println(n*n*n);}  
}  

interface My{}  

public class Test
{  
	void printName(Object obj){  
		  Class c = obj.getClass();    
		  System.out.println(c.getName());  
	}
	
	
	public static void main(String args[]) throws Exception {  

		//1) forName() method of Class class
		Class c1=Class.forName("com.Reflection.Simple");  
		System.out.println(c1.getName());  
		
		//2) getClass() method of Object class
		Simple s = new Simple();  		   
		Test t = new Test();  
		t.printName(s);  
		
		//3) The .class syntax
		Class c = boolean.class;   
		System.out.println(c.getName());  
		  
		Class c2 = Test.class;   
		System.out.println(c2.getName()); 
		
		//	Determining the class object
		Class c4=Class.forName("com.Reflection.Simple");  
		System.out.println(c4.isInterface());  
		     
		Class c5=Class.forName("com.Reflection.My");  
		System.out.println(c5.isInterface());  
		
		
		//newInstance() method
		try
		{  
			Class c6=Class.forName("com.Reflection.Simple");  
			Simple s1=(Simple)c6.newInstance();  
			s1.message();  
		} catch(Exception e){System.out.println(e);}  

		
		//Example of calling private method from another class
		Class c7 = Class.forName("com.Reflection.Simple");  
	    Object o= c7.newInstance();  
		Method m =c7.getDeclaredMethod("message1", null);  
	    m.setAccessible(true);  
	    m.invoke(o, null);  
		
		
	    //Another example to call parameterized private method from another class
	    Class c8=Simple.class;  
	    Object obj=c8.newInstance();  
	      
	    Method m1=c8.getDeclaredMethod("cube",new Class[]{int.class});  
	    m1.setAccessible(true);  
	    m1.invoke(obj,4);  
	    
		
		/* 
		 * Understanding javap tool
		  		The javap command disassembles a class file. 
		  		The javap command displays information about 
		  		the fields,constructors and methods present in a class file.
		  		
		  		Syntax to use javap tool:-
		  			javap fully_class_name  
		  			
		  		Example to use javap tool
					javap java.lang.Object  
				
				Output:
					Compiled from "Object.java"  
					public class java.lang.Object {  
					  public java.lang.Object();  
					  public final native java.lang.Class<?> getClass();  
					  public native int hashCode();  
					  public boolean equals(java.lang.Object);  
					  protected native java.lang.Object clone() throws java.lang.CloneNotSupportedException;  
					  public java.lang.String toString();  
					  public final native void notify();  
					  public final native void notifyAll();  
					  public final native void wait(long) throws java.lang.InterruptedException;  
					  public final void wait(long, int) throws java.lang.InterruptedException;  
					  public final void wait() throws java.lang.InterruptedException;  
					  protected void finalize() throws java.lang.Throwable;  
					  static {};  
					}  
					
					
					Another example to use javap tool for your class
						javac Test.java					
						javap Simple
												
						Output:
							Compiled from "Test.java"
							class com.Reflection.Simple {
							  com.Reflection.Simple();
							  void message();
							}


						javap -c command
						javac Test.java					
						javap -c Simple  

						Output:
							Compiled from "Test.java"
							class com.Reflection.Simple {
							  com.Reflection.Simple();
							    Code:
							       0: aload_0
							       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
							       4: return
							
							  void message();
							    Code:
							       0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
							       3: ldc           #3                  // String Hello Java
							       5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
							       8: return
							}


		*/
		
		
		
	}  
} 
/*

	There are 3 ways to get the instance of Class class. They are as follows:	
		forName() method of Class class
		getClass() method of Object class
		the .class syntax


	Java Reflection is a process of examining or modifying
	the run time behavior of a class at run time.
	
	 java.lang.Class class
	 
	Commonly used methods of Class class:
	Method	Description
		1) public String getName()
		2) public static Class forName(String className)throws ClassNotFoundException
		3) public Object newInstance()throws InstantiationException,IllegalAccessException
		4) public boolean isInterface()		
		5) public boolean isArray()	
		6) public boolean isPrimitive()	
		7) public Class getSuperclass()	
		8) public Field[] getDeclaredFields()throws SecurityException	
		9) public Method[] getDeclaredMethods()throws SecurityException	
		10) public Constructor[] getDeclaredConstructors()throws SecurityException	
		11) public Method getDeclaredMethod(String name,Class[] parameterTypes)throws NoSuchMethodException,SecurityException	returns the method class instance.


	Options of javap tool	
		The important options of javap tool are as follows.
		
		Option	Description
			-help	prints the help message.
			-l	prints line number and local variable
			-c	disassembles the code
			-s	prints internal type signature
			-sysinfo	shows system info (path, size, date, MD5 hash)
			-constants	shows static final constants
			-version	shows version information



*/
