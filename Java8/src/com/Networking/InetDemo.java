package com.Networking;

import java.net.*;  

//Example of Java InetAddress class
public class InetDemo
{  
	public static void main(String[] args){  
		try{  
			InetAddress ip1=InetAddress.getByName("www.facebook.com");  
			InetAddress ip2=InetAddress.getLocalHost();  
			
			System.out.println("Host Name: "+ip1.getHostName());  
			System.out.println("IP Address: "+ip1.getHostAddress());  

			System.out.println("\nLocalHost Name: "+ip2.getHostName());  
			System.out.println("LocalHost IP Address: "+ip2.getAddress());  

		}catch(Exception e){System.out.println(e);}  
	}  
} 

/*
	-	public static InetAddress getByName(String host) throws UnknownHostException
			it returns the instance of InetAddress containing LocalHost IP and name.
	
	-	public static InetAddress getLocalHost() throws UnknownHostException	
			it returns the instance of InetAdddress containing local host name and address.
	
	-	public String getHostName()	
			it returns the host name of the IP address.

	-	public String getHostAddress()	
			it returns the IP address in string format.
*/