package com.sample.core.environment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * 
 * This is example to show usage of Profile in Spring
 * Based on what profile as set to Active the corresponding bean is instantiated
 * Note both profiles has the same bean name configured.
 * @author Srinivas
 *
 */
public class CarApp {
	
	public static void main(String[] args){
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("middleClass");
		context.register(AppConfig.class);
		context.refresh();
		Car car = (Car)context.getBean("car");
		System.out.println(car.getName());
	}

}
