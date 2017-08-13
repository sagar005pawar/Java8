package com.A_practice;

//Sigma Systems
interface D
{
	void j();
	void k();
}

abstract class B implements D{
	public abstract void h();
	public void l(){
		System.out.println("L");
	}
}

class A extends B
{
	public void calculate(double i){
		System.out.println(i);
	}

	@Override
	public void h() {
		System.out.println("H..");
	}

	@Override
	public void j() {
		System.out.println("J");
	}

	@Override
	public void k() {
		System.out.println("K");
	}
}


public class Test1 {

	public static void main(String[] args) {
		A a = new A();
		int i=5;
		a.calculate(i);
		Short s=6;
		a.calculate(s);
		byte b=7;
		a.calculate(b);
		a.h();
		a.j();
		a.k();
		a.l();
	}
}

