package com.componantscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee = (Employee) context.getBean("employee",Employee.class);
		
		System.out.println(employee);
	}
}
