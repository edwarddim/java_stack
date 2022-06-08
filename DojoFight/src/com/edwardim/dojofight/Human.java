package com.edwardim.dojofight;

public class Human {
	// MEMBER VARIABLES
	public String name;
	public int dex;
	public int strength;
	public int intelligence;
	public int health;
	
	// CONSTRUCTORS
	public Human(String paramName) {
		this.name = paramName;
		this.strength = 3;
		this.dex = 3;
		this.intelligence = 3;
		this.health = 100;
	}

	public Human(String name, int dex, int strength, int intelligence, int health) {
		super();
		this.name = name;
		this.dex = dex;
		this.strength = strength;
		this.intelligence = intelligence;
		this.health = health;
	}
	
	
	// GETTERS / SETTERS / OTHER METHODS
	
	public void displayStats() {
		System.out.println("Name: " + this.name);
		System.out.println("Health: " + this.health);
		
	}
	
	public int attack(Human target) {
		int damage = this.strength * 5;
		int targetHealth = target.getHealth();
		targetHealth -= damage;
		target.setHealth(targetHealth);
		return targetHealth;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	

	
}
