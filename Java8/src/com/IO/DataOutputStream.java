package com.IO;

import java.io.*;

public class DataOutputStream {

	public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("testout.txt");  
//        DataOutputStream data = new DataOutputStream(file);  
//        data.writeInt(65);  
//        data.flush();  
//        data.close();  
        System.out.println("Succcess...");  
        
        InputStream input = new FileInputStream("testout.txt");  
        DataInputStream inst = new DataInputStream(input);  
        int count = input.available();  
        byte[] ary = new byte[count];  
        inst.read(ary);  
        for (byte bt : ary) {  
          char k = (char) bt;  
          System.out.print(k+"-");  
        }  
        
    }  
}
