package com.edwardim.zoo;

public class Bat extends Mammal{

	public Bat() {
		super();
		this.energyLevel = 300;
	}
	public Bat(int energyLevel) {
		super(energyLevel);
	}
	public void fly() {
		System.out.println("FLAP FLAP FLAP, WOOOSH");
		this.energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("NOM NOM");
		this.energyLevel += 50;
	}
	
}
