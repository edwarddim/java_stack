package com.edwadim.test;

public class AirBender extends Human {
	// MEMBER VARIABLES
	protected int airResistance;
	
	// CONSTRUCTORS
	public AirBender() {
		super();
		this.airResistance = 100;
	}
	public AirBender(String name, int age, int health, int airResistance) {
		super(name, age, 40000);
		this.airResistance = airResistance;
	}
	
	// GETTERS / SETTERS / OTHER METHODS
	
	public void damage(int dmg) {
		int current = this.getHealth();
		this.setHealth(current - dmg);
//		this.health -= dmg;
	}
	
	
	public void flying() {
		System.out.println("Fly");
	}
	
	public int getAirResistance() {
		return airResistance;
	}
	public void setAirResistance(int airResistance) {
		this.airResistance = airResistance;
	}
}
