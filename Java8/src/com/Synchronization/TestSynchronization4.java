package com.Synchronization;

	class Table5 {  
		synchronized static void printTable(int n){  
			for(int i=1;i<=10;i++){  
				System.out.println(n*i);  
				try {  
					Thread.sleep(400);
				}catch(Exception e){}  
			}  
		}  
	}  
	  
	class MyThread8 extends Thread{  
		public void run(){  
			Table5.printTable(1);
		}
	}
	  
	class MyThread9 extends Thread{  
		public void run(){  
			Table5.printTable(10);  
		}
	}
	  
	class MyThread10 extends Thread{  
		public void run(){  
			Table5.printTable(100);  
		}  
	}  
	  
	class MyThread11 extends Thread{  
		public void run(){  
			Table5.printTable(1000);  
		}  
	}  

	
	
public class TestSynchronization4 {  
	public static void main(String t[]) {  
		MyThread8 t1=new MyThread8();  
		MyThread9 t2=new MyThread9();  
		MyThread10 t3=new MyThread10();  
		MyThread11 t4=new MyThread11();  
		t1.start();  
		t2.start();  
		t3.start();  
		t4.start();  
	}  
}  


