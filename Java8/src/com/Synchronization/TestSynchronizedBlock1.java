package com.Synchronization;

class Table4{  
	void printTable(int n){  
		synchronized(this){//synchronized block  
			for(int i=1;i<=5;i++){  
				System.out.println(n*i);  
				try{  
					Thread.sleep(400);
				}catch(Exception e){System.out.println(e);}
			}  
		}
	}//end of the method
}
	  
	class MyThread6 extends Thread{  
		Table4 t;  
		MyThread6(Table4 t){  
			this.t=t;  
		}  
		public void run(){  
			t.printTable(5);  
		}  	  
	} 
	
	class MyThread7 extends Thread{  
		Table4 t;  
		MyThread7(Table4 t){  
			this.t=t;  
		}  
		public void run(){  
			t.printTable(100);  
		}  
	}  
	  
	public class TestSynchronizedBlock1 {  
		public static void main(String args[]) {  
			Table4 obj = new Table4();			//only one object
			MyThread6 t1=new MyThread6(obj);
			MyThread7 t2=new MyThread7(obj);
			t1.start();
			t2.start();
		}  
	}  



	