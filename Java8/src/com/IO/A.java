package com.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class A {
	
	public static void main(String[] args) throws IOException {
		File f1 = new File("abc");
		FileWriter fw = new FileWriter(f1);
//		FileWriter fw = new FileWriter(f1, true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.println("sagar");
		
		bw.close();
		fw.close();
		
		
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		String str = "";

		System.out.println(br.readLine());
		
//		for(str : br.readLine()){
//			System.out.println(str);
//		}
		
		br.close();
		fr.close();

	}
	
}
