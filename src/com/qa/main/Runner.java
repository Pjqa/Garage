package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Car c = new Car(4, "Large", 5, "Tesla");
		Skateboard s = new Skateboard (4, "Very small", 0, "Cardbaord");
		Boat b = new Boat (0, "Massive", 10, "Cruise");
		Garage g = new Garage();
	
		System.out.println(s.repair());
		System.out.println(c.repair());
		System.out.println(b.repair());
		
		g.addV(s);
		g.addV(c);
		g.addV(b);
		
		System.out.println(g.fixGarage());
	}

}
