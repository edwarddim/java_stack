package com.edwardim.zookeeper;

public class Bat extends Mammal {
	
	
	public Bat() {
		super(300);
	}
	
	public void fly() {
		System.out.println("FLAP FLAP");
		this.energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("NOM NOM NOM");
		this.energyLevel += 25;
	}
	public void attackTowns() {
		System.out.println("CLAW ATTACKS");
		this.energyLevel -= 100;
	}
}
