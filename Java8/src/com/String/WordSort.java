package com.String;

import java.util.*;

class A
{
	public void standerd(String s) {
		String[] strs = s.split("\\s");						//
		Arrays.parallelSort(strs);							//java 8 feature Arrays.parallelSort(arr)
		System.out.println();
		for (String string : strs) {
			System.out.print(string+" ");
		}
	}

/*	
	public void print(String s){					//this is not standerd way
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
*/	
	
}

public class WordSort {
	
	public static void main(String[] args) {

		A a1 = new A();
		a1.standerd("i am Sagar Pawar");
//		a1.print("i am Sagar Pawar ");

	}

}
