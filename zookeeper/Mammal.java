package com.edwardim.zookeeper;

public class Mammal {
	// MEMBER VARIABLES
	protected int energyLevel;
	
	// CONSTRUCTOR METHODS
	public Mammal() {
		this.energyLevel = 100;
	}

	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	// GETTERS AND SETTERS
	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	// OTHER METHODS
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
}
