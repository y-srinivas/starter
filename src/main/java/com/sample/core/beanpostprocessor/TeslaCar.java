package com.sample.core.beanpostprocessor;

import com.sample.core.beanfactorypostprocessor.Car;

public class TeslaCar extends Car implements ElectricCar{

	public void chargeBattery() {
		System.out.println("Charging Battery...");
		System.out.println("Charged");
	}

}
