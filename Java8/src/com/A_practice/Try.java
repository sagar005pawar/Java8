package com.A_practice;


class Bb {
	String n_squares(int n) {
	    StringBuffer s = new StringBuffer("0");
	    int n_squared = n*n;
	    for (int i=0; i<n_squared; i++) {
	        s.append (", " + i);
	    }
	    return s.toString();
	}
}

public class Try {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();  
        new Bb().n_squares(2000);
        System.out.println((System.currentTimeMillis()-startTime)+"ms");
    }
}