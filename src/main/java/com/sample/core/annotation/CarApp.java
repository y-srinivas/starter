package com.sample.core.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * This is example showing the configuring spring beans using annotations
 * The @Component is basic annotation used to represent a spring bean
 * Other than @Component one can use the @Service(For Service  Layer) or @Controller(for Rest Controllers) and @repository(For Persistence Layer)
 * In order to turn on the annotation based configuration we need to configure the context:annotation-config in the config
 * Additionally one can specify the base package that need to be scanned.
 * 
 * @author Srinivas
 *
 */
public class CarApp {
	
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-annotation-config.xml");
		Car car = (Car)context.getBean("car");
		car.driveCar();
	}

}
