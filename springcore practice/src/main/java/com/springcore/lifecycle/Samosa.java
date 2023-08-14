package com.springcore.lifecycle;
//Implementing init and destroy method using beans
public class Samosa {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	System.out.println("Setting price");
	this.price = price;
}

public Samosa() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}
public void init() {
	System.out.println("Inside init method");
}
public void destroy() {
	System.out.println("Inside destroy method");
}
}