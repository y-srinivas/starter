package com.sample.core.beanfactorypostprocessor;

public class Car {

	private String color;
	private String model;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public Car(){
		
		//System.out.println("This car color:" + this.color + " model:" + this.model);
	}
	
	public void seeMyCar(){
		
		System.out.println("This car color:" + this.color + " model:" + this.model);
	}
	
}
