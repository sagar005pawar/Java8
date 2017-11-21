package com.String;

public class StringRevASCII
{
	
	public StringRevASCII(String str)
	{
		String rev="", rev1="";
		for(int i=(str.length()-1);i>=0;i--) {
			rev+=(str.charAt(i));
		}
		System.out.println("StringRev(reverse char's)= "+rev.replaceAll("\\s", "").trim().replace("a", "A"));
		System.out.println("SubString(After 5 char's)= "+rev.substring(5));
		
		rev=" ";
		int i=0;
		while(str.charAt(i)!=' '){
			rev+=(str.charAt(i++));
		}
		i++;
		for(;i<str.length();i++){
			rev1+=str.charAt(i);	
		}
		System.out.println(rev1+rev);
	
	}
	
	public void strTOint(String a){
		int j=0,k=0;
		boolean f=false;
		if (a.charAt(0)=='-') {
			f=true;
			k++;
		}
		for(int i=k;i<a.length();i++){
			j*=10;
			j+=(a.charAt(i)-48);
		}
		if (f) {
			j*=(-1);
		}
		System.out.println("String To Integer converted= "+j);
	}
	
	public void ASCII()
	{
		int j;
		for(char i='0'; i<='9';i++){
			j=i;
			System.out.println(i+"= "+j);			
		}
		System.out.println();		
		for(char i='A'; i<='Z';i++){
			j=i;
			System.out.println(i+"= "+j);
		}
		System.out.println();
		for(char i='a'; i<='z';i++){
			j=i;
			System.out.println(i+"= "+j);			
		}
		
		char i=' ';
		j=i;
		System.out.println("\nspace= "+j);
	}
	
	
	
	public static void  main(String[] args) {	
		StringRevASCII s1 = new StringRevASCII("sagar pawar");			//str Rev	
		
		s1.strTOint("-1023");											//str TO int
		s1.ASCII();
		
	
		
		
		
	}
}
