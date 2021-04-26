package com.example.Insurance;

public class Life extends Insurance {
	
	public Life(String type) {
		super(type);
		setCost();
	}
	public void setCost() {
		price = 36;
	}
	public void display() {
		System.out.println("\n[Monthly fee of " + getType() + " Insurance " + "is $" + getCost()+ "]");
	}

}
