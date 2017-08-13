package com.IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.google.gson.Gson;

public class Serialization1 {
	
	public static void main(String args[])throws Exception{  

		Student s1 = new Student(211, "ravi", 25);

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("f.txt"));  
		  
		out.writeObject(s1);  
		  
		out.flush();  
		  
		System.out.println("success");  
		
		Gson g = new Gson();
		String s = g.toJson(s1);
		System.out.println(s);
		ArrayList<Student> mylist = new ArrayList<Student>();
		for(int i=0; i<5; i++){
			mylist.add(s1);
		}
		String s4 = g.toJson(mylist);
		System.out.println(s4);
		
	}  
}