package com.String;

public class StringMethods {

	public static void main(String[] args) {
		
		String str=" Sagar Pawar ";

		String st1=new String(" Sagar Pawar ");
		boolean s2=st1.equals(str);
		System.out.println("equals= "+s2);
		
		boolean s1=str.equals(str);
		System.out.println("equals= "+s1);
		
		char r8=str.charAt(5);
		System.out.println("charAt= "+r8);

		int r7=str.length();
		System.out.println("length= "+r7);
		
		String r6=str.toUpperCase();
		System.out.println("toUpperCase= "+r6);

		int s8=r6.compareTo(str);
		System.out.println("compareTo= "+s8);

		String r5=str.toString();
		System.out.println("toString= "+r5);
		
		String r4=str.toLowerCase();
		System.out.println("toLowerCase= "+r4);
		
		String r3=str.substring(7);
		System.out.println("substring= "+r3);
		
		String r2=str.concat(str);
		System.out.println("concat= "+r2);
		
		String r1=str.replace("g", "G");	//(old, new)
		System.out.println("replace= "+r1);
		
		str=" I ask to something you ";
		str=str.replaceAll("\\s", "").trim();
		System.out.println("replaceAll&trim= "+str);

		String join1 = String.join(" - ", "sagar", "vijay", "pawar");
		System.out.println("join() Method= " + join1);
		
		System.out.println("endsWith= " + join1.endsWith("ar"));
		System.out.println("endsWith= " + join1.startsWith("sa"));
		
		System.out.println("getBytes= " + join1.getBytes());
		
		System.out.println("isEmpty= " + join1.isEmpty());
		
		System.out.println("indexOf= " + join1.indexOf("r"));
		System.out.println("lastIndexOf= " + join1.lastIndexOf("r"));
	
		String sp = "Java is a programming language";
		String[] arr = sp.split("\\s");
		System.out.println("** Split() **");
		for(String s : arr){
			System.out.print(s);			
		}
		System.out.println();
		
		String[] arr1 = sp.split("\\s", 2);
		for(String s : arr1) {
			System.out.print(s);
		}

				
		
		
		
		
	}
}
