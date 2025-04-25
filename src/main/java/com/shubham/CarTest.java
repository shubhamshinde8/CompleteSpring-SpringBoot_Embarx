package com.shubham;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("carAppContext.xml");
		Car car = (Car) context.getBean("car");
		car.showCarDetails();
		car.showCarOutletsInfo();
	}
}
