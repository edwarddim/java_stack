package com.edwardim.test;

public class Human {
	// MEMBER VARIABLES
	protected String name;
	protected int strength;
	protected int intel;
	protected int dex;
	protected int health;
	// CONSTRUCTORS
	public Human(String name) {
		this.name = name;
		this.strength = 3;
		this.intel = 3;
		this.dex = 3;
		this.health = 100;
	}
	public Human(String name, int strength, int intel, int dex, int health) {
		this.name = name;
		this.strength = strength;
		this.intel = intel;
		this.dex = dex;
		this.health = health;
	}
	// GETTERS / SETTERS / OTHER METHODS
	
	public int attack(Human target) {
		target.health -= 5 * this.strength;
		return target.health;
	}
	
	public void displayStats() {
		System.out.println("Name: " + this.name);
		System.out.println("Health: " + this.health);
		System.out.println("Strength: " + this.strength);
		System.out.println("Dex: " + this.dex);
		System.out.println("Intel: " + this.intel);
	}
	
	
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
	public int getIntel() {
		return intel;
	}
	public void setIntel(int intel) {
		this.intel = intel;
	}
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
}
