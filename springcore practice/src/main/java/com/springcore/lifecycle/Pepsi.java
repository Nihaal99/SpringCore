package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
//Implementing init and destroy method using interface
public class Pepsi implements InitializingBean,DisposableBean {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Pepsi() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

public void afterPropertiesSet() throws Exception {
	//init method
	System.out.println("taking pepsi:init");
}

public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Going to put bottle back to shop:destroy");
}

}
