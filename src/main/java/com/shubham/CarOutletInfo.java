package com.shubham;

public class CarOutletInfo {

	String carColour;
	
	boolean is_car_sunroop;
	
	int freeservisingsCount;
	
	float carInsurence;

	public String getCarColour() {
		return carColour;
	}

	public void setCarColour(String carColour) {
		this.carColour = carColour;
	}

	public boolean isIs_car_sunroop() {
		return is_car_sunroop;
	}

	public void setIs_car_sunroop(boolean is_car_sunroop) {
		this.is_car_sunroop = is_car_sunroop;
	}

	public int getFreeservisingsCount() {
		return freeservisingsCount;
	}

	public void setFreeservisingsCount(int freeservisingsCount) {
		this.freeservisingsCount = freeservisingsCount;
	}

	public float getCarInsurence() {
		return carInsurence;
	}

	public void setCarInsurence(float carInsurence) {
		this.carInsurence = carInsurence;
	}

	@Override
	public String toString() {
		return "CarOutletInfo [carColour=" + carColour + ", is_car_sunroop=" + is_car_sunroop + ", freeservisingsCount="
				+ freeservisingsCount + ", carInsurence=" + carInsurence + "]";
	}
	
	
	
	
}
