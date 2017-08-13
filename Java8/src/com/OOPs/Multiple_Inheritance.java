package com.OOPs;

interface A{
	void print();
}

interface B{
	void print();	
}

class C implements B, A
{
	@Override
	public void print() {
		System.out.println("C");
	}
}

public class Multiple_Inheritance {

	public static void main(String[] args) {
		C ca=new C();
		ca.print();
	}

}
