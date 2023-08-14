package com.springcore.auto.wired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/auto/wired/autoconfig.xml");
		Emp emp=context.getBean("emp1",Emp.class);
		System.out.println(emp);
	}

}

