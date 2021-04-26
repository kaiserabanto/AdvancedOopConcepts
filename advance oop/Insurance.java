package com.example.Insurance;

public abstract class Insurance {
	
	public String type;
	public double price;
	
	public Insurance(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	public double getCost() {
		return price;
	}
	
	public abstract void setCost();
	public abstract void display();
	

}
