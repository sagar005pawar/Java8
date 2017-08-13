package com.MultiTreading;

import java.util.Iterator;

class Table
{
	synchronized static void printTable(int i){
		System.out.println();
		for (int j = 1; j <=5; j++) {
			System.out.println(i*j);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	
}

class test implements Runnable
{
	@Override
	public void run() {
			for(int j=1; j<=2; j++){
				if (Thread.interrupted()) {
					System.out.println("Thread.interrupted()= "+Thread.interrupted());
				} else {
					System.out.println("Thread.interrupted()= "+Thread.interrupted());
				}
			}
			
			
//			try {
//				Thread.sleep(2000);
//				System.out.println("sleep for 2 sec's.." + Thread.currentThread().getName());
//				System.out.println(Thread.MIN_PRIORITY);
//				System.out.println("Thread is Running..");
//				System.out.println("Thread.interrupted()= "+Thread.interrupted());
//			} catch (InterruptedException e) {
//				System.out.println("Thread.interrupted()= "+Thread.interrupted());
//				System.out.println("handled= "+e);
//			}
	}
	
}

public class Practice {

	public static void main(String[] args) {
		test t = new test();
		Thread t1 = new Thread(new test());
		Thread t2 = new Thread(new test());
		
		t1.setName("sagar");
		t2.setName("pawar");
		
		t2.setPriority(Thread.MIN_PRIORITY);

		t1.setDaemon(true);
//		t1.start();

		System.out.println();
		
		Thread t6 = new Thread(new test());
		
		t6.start();
		t6.interrupt();
		t2.start();
//		System.out.println(t6.isInterrupted());
		
		
/*		
		//for synchronized method / block
		Table tab = new Table();		
		Runnable r = ()->tab.printTable(5);
		Thread t3 = new Thread(r);
		t3.start();

		Runnable r2 = ()->tab.printTable(10);
		Thread t4 = new Thread(r2);
		t4.start();
*/		
		
/*		
		//for synchronized static method
		Runnable r = ()->new Table().printTable(5);		
		Thread t3 = new Thread(r);
		t3.start();

		Runnable r2 = ()->new Table().printTable(10);
		Thread t4 = new Thread(r2);
		t4.start();
*/		
		
/*		
		System.out.println(t1.getName());
		t1.setName("sagar");
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
*/		
		
	}
	
}
