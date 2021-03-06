package com.sample.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.core.beanfactorypostprocessor.Car;

public class App {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
		Car car = (Car) context.getBean("car");
		car.seeMyCar();
		
	}
}
