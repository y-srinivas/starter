package com.sample.core.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

/**
 * Allows for custom modification of an application context's bean definitions, adapting the bean property values of the context's underlying bean factory.
 * Application contexts can auto-detect BeanFactoryPostProcessor beans in their bean definitions and apply them before any other beans get created.
 * Useful for custom config files targeted at system administrators that override bean properties configured in the application context.
 * See PropertyResourceConfigurer and its concrete implementations for out-of-the-box solutions that address such configuration needs.
 * A BeanFactoryPostProcessor may interact with and modify bean definitions, but never bean instances. Doing so may cause premature bean instantiation, violating the container and causing unintended side-effects. If bean instance interaction is required, consider implementing BeanPostProcessor instead.
 * @author Y Srinivas
 *
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		//Example shows dynamically injecting properties from properties file to the spring config
		PropertyPlaceholderConfigurer cfg = new PropertyPlaceholderConfigurer();  
	    cfg.setLocation(new ClassPathResource("car.properties"));  
		cfg.postProcessBeanFactory(beanFactory); 
		System.out.println("Inside bean factory Post Processor");
		
	}

}
