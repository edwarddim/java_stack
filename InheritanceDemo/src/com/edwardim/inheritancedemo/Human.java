package com.edwardim.inheritancedemo;

public class Human {
	// MEMBER VARIABLES
	protected String name;
	protected int strength;
	protected int health;
	protected int intelligence;
	// CONSTRUCTORS
	public Human() {
		
	}
	
	public Human(String name, int strength, int health, int intelligence) {
		this.name = name;
		this.strength = strength;
		this.health = health;
		this.intelligence = intelligence;
	}
	// GETTERS / SETTERS / OTHER METHODS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public void move() {
		System.out.println("Walk");
	}
	
	
}
