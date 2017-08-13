package com.A_practice;

final class Abn
{
	private final int id;
	private final String name;
	
	public Abn(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Abc [id=" + id + ", name=" + name + "]";
	}
}


public class Immutable7 
{
	public static void main(String[] args) {
		Abn a= new Abn(2, "sagar");
		System.out.println(a);
		
		
	
		
	}
}
