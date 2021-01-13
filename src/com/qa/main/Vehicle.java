package com.qa.main;

public abstract class Vehicle {

	private int Wheels;
	private String Size;
	private int Seats;
	
	 public Vehicle() {
	        super();
	    }

	public int getWheels() {
		return Wheels;
	}

	public void setWheels(int wheels) {
		this.Wheels = wheels;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		this.Size = size;
	}

	public int getSeats() {
		return Seats;
	}

	public void setSeats(int seats) {
		this.Seats = seats;
	}

	
	public Vehicle(int wheels, String size, int seats) {
		super();
		this.Wheels = wheels;
		this.Size = size;
		this.Seats = seats;
	}
	
	
	@Override
	public String toString() {
		return "Vehicle [Wheels=" + Wheels + ", Size=" + Size + ", Seats=" + Seats + "]";
	}

	public abstract String makeNoise();			
		
	public abstract double repair();


}

