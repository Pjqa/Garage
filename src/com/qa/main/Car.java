package com.qa.main;

public class Car extends Vehicle {

	private String carType;
	
	
	public String getCarType() {
		return carType;
	}


	public void setCarType(String carType) {
		this.carType = carType;
	}


	@Override
	public String makeNoise() {
		return ("Va va va vooooom");
	}


	public Car(int wheels, String size, int seats, String carType) {
		super(wheels, size, seats);
		this.carType = carType;
	}


	@Override
	public double repair() {
		double price = ( 4 * 5);
		return price;
	}


	@Override
	public String toString() {
		return "Car [carType=" + carType + ", repair()=" + repair() + ", getWheels()=" + getWheels() + ", getSize()="
				+ getSize() + ", getSeats()=" + getSeats() + "]";
	}



   
		
}
