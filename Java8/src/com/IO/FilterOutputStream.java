/*package com.IO;

import java.io.*;

public class FilterOutputStream {

	public static void main(String[] args) throws IOException {  
        File data = new File("testout.txt");  
        FileOutputStream file = new FileOutputStream(data);  
        FilterOutputStream filter = new FilterOutputStream(file);  
        String s="Welcome to javaTpoint.";      
        byte b[]=s.getBytes();      
        filter.write(b);     
        filter.flush();  
        filter.close();  
        file.close();  
        System.out.println("Success...");  
        
        
        File data1 = new File("testout.txt");  
        FileInputStream  file1 = new FileInputStream(data1);  
        FilterInputStream filter1 = new BufferedInputStream(file1);  
        int k =0;  
        while((k=filter1.read())!=-1){  
            System.out.print((char)k);  
        }  
        file1.close();  
        filter1.close();  
    }  
}
*/