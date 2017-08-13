package com.A_practice;

class MySingleton
{
    private static MySingleton instance = null;
    private int x;
   
    // private constructor can't be accessed outside the class
    private MySingleton() {  }

    // Factory method to provide the users with instances
	public static MySingleton getInstance() {
        if (instance == null)        
            instance = new MySingleton();
 
       return instance;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
  
    
}
 
// Driver Class
public class Singleton {
	public static void main(String args[]){
		MySingleton a = MySingleton.getInstance();
		MySingleton b = MySingleton.getInstance();
		a.setX(15);
	    System.out.println("Value of a.x = " + a.getX());
	    System.out.println("Value of b.x = " + b.getX());
	}    
}
