package com.edwardim.test;

public class Wizard extends Human {
	protected int mana;
	
	public Wizard(String name) {
		super(name, 3, 25, 3, 50);
		this.mana = 100;
	}
	
	// GETTERS / SETTERS / OTHER METHODS
	
	public int attack(Human target) {
		int damage = 5 * this.intel;
		target.health -= damage;
		this.health += damage;
		return target.health;
	}
	

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}
	
}
