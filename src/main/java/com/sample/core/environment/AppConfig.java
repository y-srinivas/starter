package com.sample.core.environment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {
	
	@Bean(name="car")
	@Profile(value="affluent")
	public Car myRichCar()  {
		return new Audi();
	}
	
	@Bean(name="car")
	@Profile(value="middleClass")
	public Car myEconomyCar(){
		return new Nano();
	}

}
