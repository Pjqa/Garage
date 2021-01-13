package com.qa.main;

import java.util.ArrayList;

import java.util.List;

public class Garage {
	
	String name;
	
	public Garage() {
        super();
    }
	
	private List<Vehicle> VehicleList = new ArrayList <>();
	 
	
	
	public void addV (Vehicle v) {
		this.VehicleList.add(v);
	}	
	
	public void removeV (Vehicle v) {
		this.VehicleList.remove(v);
	}
	
	public void removeVbyType (Class<?> c) {
		
		List<Vehicle> toRemove = new ArrayList<>();
		for (Vehicle v : VehicleList) {
			if (v.getClass() == c) {
				toRemove.add(v);
			}
		}
	
		VehicleList.removeAll(toRemove);
	
	}

	public double fixGarage () {
		
		double overallSum = 0.0;
		
			for (Vehicle v : VehicleList) {
				overallSum += v.repair();
	}		
				return overallSum;
	}
}