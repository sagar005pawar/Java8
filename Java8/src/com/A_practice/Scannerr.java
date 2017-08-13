package com.A_practice;

import java.util.Scanner;

public class Scannerr {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		System.out.println("Enter/Type Something=>\t");
		String str = scaner.nextLine();
		System.out.println(str);
		System.err.println(str);
	}
}

/*
		System.out.println(str);
		System.err.println();
		System.out.println("C.main()");
		System.in.read();

*/
