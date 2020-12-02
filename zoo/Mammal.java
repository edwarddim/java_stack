package com.edwardim.zoo;

public class Mammal {
//	MEMBER VARIABLES
	protected int energyLevel;
//	CONSTRUCTORS
	public Mammal() {
		this.energyLevel = 100;

	}
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}

//	GETTERS AND SETTERS
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		if(energyLevel >= 0) {
			this.energyLevel = energyLevel;
		}
	}
//	OTHER METHODS
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
}
