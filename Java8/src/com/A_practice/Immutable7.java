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
		System.out.println(a + "  hashCode= " +a.hashCode());
		
		a= new Abn(3, "pawar");
		System.out.println(a + "  hashCode= " +a.hashCode());
		
		
/*
 * Immutable class object not modify, every times creates new object with diff hashCode
 * 
 * o/p:-
 * Abc [id=2, name=sagar]  hashCode= 31168322
 * Abc [id=3, name=pawar]  hashCode= 17225372
*/		
		
		
	}
}
