package com.edwardim.dojofight;

public class Wizard extends Human {
	public Wizard(String name) {
		super(name, 3, 3, 25, 50);
	}
	
	public Wizard(String name, int dex, int strength, int intelligence, int health) {
		super(name, dex, strength, intelligence, health);
	}
	
	
	public int attack(Human target) {
		int damage = this.intelligence * 5;
		int targetHealth = target.getHealth();
		targetHealth -= damage;
		target.setHealth(targetHealth);
		
		this.health += damage;
		return targetHealth;
	}
}
