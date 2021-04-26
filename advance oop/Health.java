package com.example.Insurance;

public class Health extends Insurance{
	public Health(String type) {
		super(type);
		setCost();
	}
	public void setCost() {
		price = 196;
	}
	public void display() {
		System.out.println("\n[Monthly fee of " + getType() + " Insurance " + "is $" + getCost() +"]");
	}
}
