package com.shubham;

public class CarSpecification {
	
	String make;
	
	String model;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "CarSpecification [make=" + make + ", model=" + model + "]";
	}
	
	
}
