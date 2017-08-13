package com.RuntimeClass;

//	Restart system in Java
public class Runtime4{  
	 public static void main(String args[])throws Exception{  
	  Runtime.getRuntime().exec("shutdown -r -t 0");  
	 }  
	}  