package com.MultiTreading;

public class Multi3 implements Runnable {			

	@Override
	public void run() {								//Runnale have only one method run()
		// TODO Auto-generated method stub
		System.out.println("thread is running...");  
	}  
		  
	public static void main(String args[]){  
		Multi3 m1=new Multi3();  
		Thread t1 =new Thread(m1);  	//Thread(Runnable r)  constructor called
		t1.start();  
	}  
}
