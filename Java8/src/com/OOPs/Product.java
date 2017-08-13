package com.OOPs;

import java.io.Serializable;

public class Product implements Serializable, Cloneable {  
    int id;  
    String name;  
    float price;  
    
    public Product() {  
        this.id = 0;  
        this.name = null;  
        this.price = 0.0f;  
    }
    
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return id + "\t" + name + "\t" + price;
	}  

	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}