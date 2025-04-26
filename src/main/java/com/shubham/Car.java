package com.shubham;

import org.springframework.stereotype.Component;


public class Car {

	private CarSpecification carSpecification;

	private CarOutletInfo carOutletInfo;

	public CarOutletInfo getCarOutletInfo() {
		return carOutletInfo;
	}

	public void setCarOutletInfo(CarOutletInfo carOutletInfo) {
		this.carOutletInfo = carOutletInfo;
	}

	public CarSpecification getCarSpecification() {
		return carSpecification;
	}

	public void setCarSpecification(CarSpecification carSpecification) {
		this.carSpecification = carSpecification;
	}

	public void showCarDetails() {
		System.out.println("Car Details :: " + carSpecification.toString());
	}
	
	public void showCarOutletsInfo() {
		System.out.println("Car Outlets :: "+ carOutletInfo.toString());
	}
}
