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
	public void caDouble(double i){	//double argm. method access int, short, byte, long, float & double values
		System.out.println(i);			// also access wrapper class objects
	}									//but Double wrapper class argm. method access only double & Double values only
	
	public void caFloat(float f) { //double argm. method access int, short, byte, long & float, but can't double values
		System.out.println(f);		// also access wrapper class objects
	}								//but Float wrapper class argm. method access only float & Float values only

	public void caLong(long l) {			// long argm. access int, short, byte & long also as like wrapper
		System.out.println(l);			// not accessing double & float
	}								//but Long wrapper class argm. method access only Long & long values only

	public void caInt(int i) {			// int argm. access int, short, byte also as like wrapper
		System.out.println(i);			// not accessing long, double & float
	}								//but Integer wrapper class argm. method access only Integer & int values only

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
		int i=2;
		short s=3;
		byte b=4;
		long l = 5l;
		float f = 6.14f;
		double d = 7.25d;
		Integer i1 = new Integer(8);
		Short s1 = new Short("9");
		Byte b1 = new Byte((byte) 10);
		Long l1 = new Long(11l);
		Float f1 = new Float(12.45f);
		Double d1 = new Double(13.85d);

		System.out.println("prim. with double");
		a.caDouble(i);
		a.caDouble(s);
		a.caDouble(b);
		a.caDouble(l);
		a.caDouble(f);
		a.caDouble(d);

		System.out.println("prim. with float");
		a.caFloat(i);
		a.caFloat(s);
		a.caFloat(b);
		a.caFloat(l);
		a.caFloat(f);
		//a.caFloat(d);		//error
		
		System.out.println("prim. with long");
		a.caLong(i);
		a.caLong(s);
		a.caLong(b);
		a.caLong(l);
		//a.caLong(d);	//compile time error
		//a.caLong(f);

		System.out.println("prim. with int");
		a.caInt(i);
		a.caInt(s);
		a.caInt(b);
		//a.caInt(l);
		//a.caLong(d);	//compile time error
		//a.caLong(f);

		
		a.h();
		a.j();
		a.k();
		a.l();
	}
}