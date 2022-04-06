package com.edwardim.inheritancedemo;

public class AirHuman extends Human implements GravityInterface, SwimmingInterface {
	// MEMBER VARIALBES
	protected int airBend;
	// CONSTRUCTOR
	public AirHuman(String name, int strength, int health, int intelligence, int airBend) {
		super(name, strength, health, intelligence);
		this.airBend = airBend;
	}
	// GETTERS / SETTERS / OTHER METHODS
	@Override
	public void move() {
		System.out.println("Fly");
	}
	
	public int getAirBend() {
		return airBend;
	}
	public void setAirBend(int airBend) {
		this.airBend = airBend;
	}
	
	
	@Override
	public void movement() {
		System.out.println("Fly");
	}
	@Override
	public void swim() {
		System.out.println("Run on water");
	}
}