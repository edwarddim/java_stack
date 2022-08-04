package com.edwardim.inheritancedemo;

public class AirHuman extends Human {
	// MEMBER VARIABLES
	protected int airResistance;
	
	// CONSTRUCTORS
	public AirHuman(String name, int strength, int health, int intelligence, int airResistance) {
		super(name, strength, health, intelligence);
		this.airResistance = airResistance;
	}
	
	public AirHuman() {
		super("Default Name", 80, 5, 15);
		this.airResistance = 10;
	}

	// GETTERS / SETTERS / OTHER METHODS
	
	public void move() {
		System.out.println("Flying");
	}
	
	public int getAirResistance() {
		return airResistance;
	}

	public void setAirResistance(int airResistance) {
		this.airResistance = airResistance;
	}
	
	
}
