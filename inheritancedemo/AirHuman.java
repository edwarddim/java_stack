package com.edwardim.inheritancedemo;

public class AirHuman extends Human {
	// MEMBER VARIABLES
	protected int airResist;
	// CONSTUCTOR
	public AirHuman(String name, int age, String gender, int airResist) {
		super(name, age, gender);
		this.airResist = airResist;
	}
	public void move() {
		System.out.println("USE AIR GLIDER");
	}
	

	// GETTERS AND SETTERS
	public int getAirResist() {
		return airResist;
	}
	public void setAirResist(int airResist) {
		this.airResist = airResist;
	}	
	
}
