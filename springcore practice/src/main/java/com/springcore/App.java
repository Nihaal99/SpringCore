package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //context we can assume it as spring container
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Student student1=(Student) context.getBean("student1");
        Student student2=(Student) context.getBean("student2");
        //The IOC Container will create object in background and will responsible for the lifecycle of the object
        System.out.println(student1 );
        System.out.println(student2 );
        
    }
}
