package com.sample.core.beanpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.core.beanfactorypostprocessor.Car;

public class TeslaCarApp {

	/**
	 * Example Demos use of BeanFactoryPostProcessor and BeanPostProcessor
	 * BeanFactoryPostProcessor injects the properies 
	 * BeanPostProcessor conditionally triggers logic based on the bean type
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Car car = (Car) context.getBean("teslaCar");
		car.seeMyCar();

	}

}
