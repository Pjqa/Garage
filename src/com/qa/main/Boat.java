package com.qa.main;

public class Boat extends Vehicle {
	
	private String boatType;
	

	
	public String getBoatType() {
		return boatType;
	}


	public void setBoatType(String boatType) {
		this.boatType = boatType;
	}


	@Override
	public String makeNoise() {
		return ("Za za za zoooom");
	}


	public Boat(int wheels, String size, int seats, String boatType) {
		super(wheels, size, seats);
		this.boatType = boatType;
	}
	
	@Override
	public double repair() {
		double price = (0 /10);
		return price;

	}


	@Override
	public String toString() {
		return "Boat [boatType=" + boatType + ", repair()=" + repair() + ", getWheels()=" + getWheels() + ", getSize()="
				+ getSize() + ", getSeats()=" + getSeats() + "]";
	}
	
	

	
	
}
