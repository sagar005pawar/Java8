package com.String;

public class InstanceTest
{  
    public static void main(String args[]){
    	
    	String st = " Java is Platform Independent by Bytecode ";
    	System.out.println(st.replaceAll("\\s", ""));
    	System.out.println(st.replace("s", "P"));
    	
        System.out.println("Hashcode test of String:");
        String str="java";
        System.out.println(str.hashCode());  
        str=str+"tpoint";
        System.out.println(str.hashCode());
   
        System.out.println("Hashcode test of StringBuffer:");
        StringBuffer sb=new StringBuffer("java");
        System.out.println(sb.hashCode());
        sb.append("tpoint");
        System.out.println(sb.hashCode());
        
        
        /*		
			char[] ch = {'j','a','v','a'};
			String str = new String(ch);
			System.out.println(str);
         */		

    }  
}