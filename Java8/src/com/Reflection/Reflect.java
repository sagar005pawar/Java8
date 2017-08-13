package com.Reflection;

import java.lang.reflect.*;

class Rf
{
	public int id;
	public Rf(){}
	void display(){}
}


public class Reflect {

	public static void main(String[] args) throws Exception {

	Class c=Class.forName("com.Reflection.Rf"); 
	Rf r=(Rf)c.newInstance();

	
    System.out.println("Fields........");  
    java.lang.reflect.Field[] f = c.getDeclaredFields();  
    for(int i=0;i<f.length;i++)  
        System.out.println(f[i]);  
      
    System.out.println("Constructors........");  
    Constructor con[]=c.getDeclaredConstructors();  
    for(int i=0;i<con.length;i++)  
        System.out.println(con[i]);  
      
        System.out.println("Methods........");  
    Method m[]=c.getDeclaredMethods();  
    for(int i=0;i<m.length;i++)  
        System.out.println(m[i]);  		

	}
}
