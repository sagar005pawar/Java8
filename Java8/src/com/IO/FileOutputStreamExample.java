package com.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {  
    public static void main1(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("testout.txt");    
             fout.write(65);    //ASCII value of 'A' char
             fout.close();    
             System.out.println("success..."); 
             
             FileInputStream fin = new FileInputStream("testout.txt");    
             int i = fin.read();  
             System.out.print((char)i);    
   
             fin.close();    
            }catch(Exception e){System.out.println(e);}    
      }    
    
    public static void main(String args[]){    
        try{    
          FileOutputStream fout=new FileOutputStream("testout.txt");    
          String s="Welcome to javaTpoint.";    
          byte b[]=s.getBytes();//converting string into byte array    
          fout.write(b);    
          fout.close();    
          System.out.println("success...");
          
          FileInputStream fin = new FileInputStream("testout.txt");    
          int i=0;    
          while((i=fin.read())!=-1){    
        	  System.out.print((char)i);    
          }    
          fin.close();  
         }catch(Exception e){System.out.println(e);}    
   } 
}