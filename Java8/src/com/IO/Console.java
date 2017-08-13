package com.IO;


public class Console {
	public static void main1(String args[]){    
		java.io.Console c=System.console();    
		System.out.println("Enter your name: ");    
		String n = c.readLine();    
		System.out.println("Welcome "+n);    
	}   
	
	public static void main(String args[]){    
		java.io.Console c=System.console();    
		System.out.println("Enter password: ");    
		char[] ch=c.readPassword();    
		String pass=String.valueOf(ch);//converting char array into string    
		System.out.println("Password is: "+pass);    
		}    
}
