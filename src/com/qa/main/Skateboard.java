package com.qa.main;

public class Skateboard extends Vehicle {

	private String skateType;
	
	
	public String getMotoBType() {
		return skateType;
	}


	public void setMotoBType(String motoBType) {
		this.skateType = motoBType;
	}


	@Override
	public String makeNoise() {
		return ("Ga ga ga goooom");
	}


	
	public Skateboard(int wheels, String size, int seats, String skateType) {
		super(wheels, size, seats);
		this.skateType = skateType;
	}

	@Override
	public double repair() {
		double price = (4 +0);
		return price;
	}


	@Override
	public String toString() {
		return "Skateboard [skateType=" + skateType + ", repair()=" + repair() + ", getWheels()=" + getWheels()
				+ ", getSize()=" + getSize() + ", getSeats()=" + getSeats() + "]";
	}

}
