package com.Synchronization;

//Example of interrupting a thread that stops working
public class TestInterruptingThread1 extends Thread
{
	public void run(){  
		try {
			Thread.sleep(1000);  
			System.out.println("task");  
		}catch(InterruptedException e){  
			throw new RuntimeException("Thread interrupted..."+e);  
		}  	  
	}  
	  
	public static void main(String args[]){  
		TestInterruptingThread1 t1 = new TestInterruptingThread1();  
		t1.start();  
		try{  
			t1.interrupt();  
		}catch(Exception e){System.out.println("Exception handled " + e);}  
	}  
	
}  

/*

The 3 methods provided by the Thread class for interrupting a thread

	public void interrupt()
	public static boolean interrupted()
	public boolean isInterrupted()

*/


