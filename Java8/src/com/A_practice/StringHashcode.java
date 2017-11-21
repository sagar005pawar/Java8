package com.A_practice;
/* 	 dynamically creates 3 objects(in string constant pool) here only	*/
public class StringHashcode {
	public static void main(String[] args) {
		String a = "Aa";
		String b = "BB";
		
		System.out.println(a.hashCode());						//2112
		System.out.println(b.hashCode());						//2112
		
		System.out.println(31 * ('C' - 'D') == ('B' - 'a'));	//true
		System.out.println(31 * ('B' - 'A') == ('a' - 'B'));	//true

		System.out.println("common_prefixDB".hashCode());		//-1027514780
		System.out.println("common_prefixCa".hashCode());		//-1027514780
	}
}

/* 	Output:-2112
			2112
			true
			true
			-1027514780
			-1027514780	
 */