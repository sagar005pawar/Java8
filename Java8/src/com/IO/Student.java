package com.IO;

import java.io.Serializable;

public class Student implements Serializable, Cloneable
{  
	 private int id;  
	 private String name;  
	 private int age;
	 //transient int age;	// Java transient keyword is used in serialization. 
	    			// If you define any data member as transient, it will not be serialized.
	@Override
	public String toString() {
		return "\n" + id + "\t" + name + "\t" + age;
	}
	public Student() {
		super();
		this.id = 0;
		this.name = null;
		this.age = 0;
	}
	 
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}  