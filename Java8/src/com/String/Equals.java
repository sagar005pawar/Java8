package com.String;

public class Equals {

	public static void main(String... java) {
		
		String s1 = "sagar";
		String s2 = "sagar";
		
		System.out.println(s1==s2);			//true
		System.out.println(s1.equals(s2));	//true
		System.out.println(s1.hashCode() + "\t" + s2.hashCode());
		
		
		/* **** JAVA **** */
		String s3 = "hello", s4 = "hel"+"lo", s5 = " mum";
		if (s3==s4) {
			System.out.println("same");			
		} else {
			System.out.println("diff");
		}
		
		if ((s3+s5)=="hello mum") {
			System.out.println("same");		//expected this	
		} else {
			System.out.println("diff");
		}

		
		
		if (s3.equals(s4)) {
			System.out.println("same");			
		} else {
			System.out.println("diff");
		}

		if ((s3+s5).equals("hello mum")) {
			System.out.println("same");		//expected this	
		} else {
			System.out.println("diff");
		}
		
		
	}	
}

