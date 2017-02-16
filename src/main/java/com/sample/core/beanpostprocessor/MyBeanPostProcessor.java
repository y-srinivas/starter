package com.sample.core.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor  {

	public Object postProcessAfterInitialization(Object bean, String arg1) throws BeansException {
		System.out.println("Inside Bean After init Processor");
		if(bean instanceof ElectricCar)
			((ElectricCar) bean).chargeBattery();
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String arg1) throws BeansException {
		System.out.println("Inside Bean before init Processor");
		return bean;
	}

}
