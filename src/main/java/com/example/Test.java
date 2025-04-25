package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {  
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Car c = (Car) context.getBean("car");
		
		System.out.println(c.toString());
		c.showCarDetails();
	}

}
