package com.example;

public class Car {
	
	String name;
	String model;
	double price;
	
	
	
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", price=" + price + "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public void showCarDetails() {
		System.out.println(name);
		System.out.println(model);
		System.out.println(price);
	}
}
