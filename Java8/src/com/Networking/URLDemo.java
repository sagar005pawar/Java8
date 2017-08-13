package com.Networking;

//Example of Java URL class	URLDemo.java  
import java.io.*;  
import java.net.*;  

public class URLDemo
{  
	public static void main(String[] args){  
		try{  
			URL url=new URL("http://www.javatpoint.com/java-tutorial");  
			
			System.out.println("Protocol: "+url.getProtocol());  
			System.out.println("Host Name: "+url.getHost());  
			System.out.println("Port Number: "+url.getPort());  
			System.out.println("File Name: "+url.getFile());  
		
		}catch(Exception e){System.out.println(e);}  
	}  
}  

/*
	A URL contains many information:
	
	Protocol: In this case, http is the protocol.
	Server name or IP Address: In this case, www.javatpoint.com is the server name.
	Port Number: It is an optional attribute. If we write http//ww.javatpoint.com:80/sonoojaiswal/ , 80 is the port number. If port number is not mentioned in the URL, it returns -1.
	File Name or directory name: In this case, index.jsp is the file name.

*/

