package com.edwardim.inheritancedemo;

public class AirHuman extends Human implements SwimmingInterface, GravityInterface  {
	// MEMBER VARIABLES
	protected int airResist;
	// CONSTUCTOR
	public AirHuman(String name, int age, String gender, int airResist) {
		super(name, age, gender);
		this.airResist = airResist;
	}
	

	// GETTERS AND SETTERS
	public int getAirResist() {
		return airResist;
	}
	public void setAirResist(int airResist) {
		this.airResist = airResist;
	}
	@Override
	public void greeting() {
		System.out.println("TAKE A BOW");
	}
	@Override
	public void move() {
		System.out.println("USE GLIDER TO FLY");
	}
	@Override
	public void swimming() {
		System.out.println("INSTEAD OF SWIMMINNG RUN ALONG WATER");
		SwimmingInterface.waterViscocity;
	}
	@Override
	public void fly() {
		System.out.println("FLYING IS EASY FOR AN AIRBENDER");
		GravityInterface.gravity;
	}
}
