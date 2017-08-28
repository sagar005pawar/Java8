package com.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class A
{
	public void print1(){
		
	}
	
	public void print(String s){
		String t = "";
		List<String> l1 = new ArrayList<>();
		for(int i=0; i<s.length();i++){
			if(s.charAt(i)==32||s.charAt(i)==' '){
				l1.add(t);
				t="";
			}
			t=t + s.charAt(i);
		}
		Collections.sort(l1);
		l1.forEach(n->System.out.print(n));
	}
}

public class WordSort {
	
	public static void main(String[] args) {

		A a1 = new A();
		a1.print("i am Sagar Pawar ");
	}

}
