package com.edwardim.inheritancedemo;

public class FireHuman extends Human {
	// MEMBER VARIABLE
	protected int fireResist;
	
	
	
	// CONSTRUCTORS
	public FireHuman() {
		super();
		this.fireResist = 10;
	}
	public FireHuman(String name, int strength, int health, int intelligence, int fireResist) {
		super(name, strength, health, intelligence);
		this.fireResist = fireResist;
	}
	
	
	// GETTERS / SETTERS / OTHER METHODS
	
	public void move() {
		System.out.println("Rocket boost");
	}
	
	public int getFireResist() {
		return fireResist;
	}
	public void setFireResist(int fireResist) {
		this.fireResist = fireResist;
	}
	
	
}
