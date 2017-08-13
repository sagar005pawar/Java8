package com.A_practice;

class Aclass
{
	private static Aclass instance = null;
	private int id;
	
    public Aclass() throws Exception {		//Singleton with public constructor
       if(instance != null)
          throw new Exception("Instance already exist");      
       //Else, do whatever..such as creating an instance
    }
	public static Aclass getInstance() throws Exception {
		if(instance==null) {
			instance = new Aclass();
		}
		return instance;			
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    
}

public class Singletone2 {
	
	public static void main(String[] args) {
		try {
			Aclass a = Aclass.getInstance();
			Aclass b = Aclass.getInstance();
			a.setId(10);
			System.out.println(a.getId());
			System.out.println(b.getId());
		} catch (Exception e) {
			System.out.println(e);	
		}
	}
}
