package com.sample.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	private Driver driver;
	
	@Autowired
	@Qualifier("allWheelDrive")
	private DriveType driveType;

	public void driveCar(){
		System.out.println("This car is driven by"+ driver.getName()+" drive type" + driveType.getType());
		
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
}
