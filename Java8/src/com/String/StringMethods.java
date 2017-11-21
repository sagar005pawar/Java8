package com.String;

public class StringMethods {

	public static void main(String[] args) {
		
		String str=" Sagar Pawar ";

		String st1=new String(" Sagar Pawar ");
		boolean s2=st1.equals(str);				//true
		System.out.println("equals= "+s2);
		
		boolean s1=str.equals(str);				//true
		System.out.println("equals= "+s1);
		
		char r8=str.charAt(5);
		System.out.println("charAt= "+r8);		// r

		int r7=str.length();
		System.out.println("length= "+r7);		//13
		
		String r6=str.toUpperCase();			//  SAGAR PAWAR 
		System.out.println("toUpperCase= "+r6);		

		int s8=r6.compareTo(str);				// -32
		System.out.println("compareTo= "+s8);

		String r5=str.toString();				//  Sagar Pawar 
		System.out.println("toString= "+r5);
		
		String r4=str.toLowerCase();			//  sagar pawar 
		System.out.println("toLowerCase= "+r4);
		
		String r3=str.substring(7);				// Pawar 
		System.out.println("substring= "+r3);
		
		String r2=str.concat(str);				//  Sagar Pawar  Sagar Pawar 
		System.out.println("concat= "+r2);
		
		String r1=str.replace("g", "G");	//(old, new)
		System.out.println("replace= "+r1);		//  SaGar Pawar 
		
		str=" I ask to something you ";
		str=str.replaceAll("\\s", "").trim();	// Iasktosomethingyou
		System.out.println("replaceAll&trim= "+str);

		String join1 = String.join(" - ", "sagar", "vijay", "pawar");
		System.out.println("join() Method= " + join1);	// sagar - vijay - pawar
		
		System.out.println("endsWith= " + join1.endsWith("ar"));	//true
		System.out.println("startsWith= " + join1.startsWith("sa"));	//true
		
		System.out.println("getBytes= " + join1.getBytes());		//[B@1db9742
		
		System.out.println("isEmpty= " + join1.isEmpty());			//false
		
		System.out.println("indexOf= " + join1.indexOf("r"));		//4
		System.out.println("lastIndexOf= " + join1.lastIndexOf("r"));//20
	
		String sp = "java is a programming language";
		String[] arr = sp.split("\\s");
		System.out.println("** Split() **");
		for(String s : arr){
			System.out.print(s +" ");			//java is a programming language 
		}
		System.out.println();
		
		String[] arr1 = sp.split("\\s", 2);		//split from 2nd space
		for(String s : arr1) {
			System.out.print(s);				//javais a programming language
		}

		String a = "sagar";
		String b = "sagas";
		System.out.println("\ncompareTo= "+a.compareTo(b));	//-1
		
		
		
		
	}
}


