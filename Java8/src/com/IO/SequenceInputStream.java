/*package com.IO;

import java.io.*;
import java.util.*;

public class SequenceInputStream {

	public static void main(String args[])throws Exception{    
		   FileInputStream input1=new FileInputStream("testin.txt");    
		   FileInputStream input2=new FileInputStream("testout.txt");    
		   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
		   int j;    
		   while((j=inst.read())!=-1){    
		    System.out.print((char)j);    
		   }    
		   inst.close();    
		   input1.close();    
		   input2.close();    
		  }   
	
	
	public static void main2(String args[])throws Exception{    
		   FileInputStream fin1=new FileInputStream("testin1.txt");    
		   FileInputStream fin2=new FileInputStream("testin2.txt");    
		   FileOutputStream fout=new FileOutputStream("testout.txt");      
		   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);    
		   int i;    
		   while((i=sis.read())!=-1)    
		   {    
		     fout.write(i);        
		   }    
		   sis.close();    
		   fout.close();      
		   fin1.close();      
		   fin2.close();       
		   System.out.println("Success..");  
		  } 
	
	public static void main3(String args[])throws IOException{    
		//creating the FileInputStream objects for all the files    
		FileInputStream fin=new FileInputStream("a.txt");    
		FileInputStream fin2=new FileInputStream("b.txt");    
		FileInputStream fin3=new FileInputStream("c.txt");    
		FileInputStream fin4=new FileInputStream("d.txt");    
		//creating Vector object to all the stream    
		Vector v=new Vector();    
		v.add(fin);    
		v.add(fin2);    
		v.add(fin3);    
		v.add(fin4);              
		//creating enumeration object by calling the elements method    
		Enumeration e=v.elements();      
		//passing the enumeration object in the constructor    
		SequenceInputStream bin=new SequenceInputStream(e);    
		int i=0;      
		while((i=bin.read())!=-1){    
		System.out.print((char)i);    
		}     
		bin.close();    
		fin.close();    
		fin2.close();    
		}   
}
*/