package com.controlStatements;

public class Statements {

	public static void main(String[] args) {

		int b = 2;
		for(int a=1 ; a < b; a++) {
			System.out.println(a);
		}

		if(true == false) {
			System.out.println("abc");
		}

//		if(true < false) {						//compiled failed
//			System.out.println("abc");
//		}

		
		//for();								//compiled failed
	
		for( ;  ; ) {}
		
		
		
	}
	
}
