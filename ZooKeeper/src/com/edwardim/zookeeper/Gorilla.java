package com.edwardim.zookeeper;

public class Gorilla extends Mammal {
	// MEMBER VARIABLES
	// CONSTRUCTORS
	public Gorilla() {
		super();
	}
	
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	
	
	// GETTERS / SETTERS / OTHER METHODS
	public void throwSomething() {
		System.out.println("The gorillas has thrown something");
		this.energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("YUM YUM IN THE TUM TUM");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("The gorillas goes up the tree");
		this.energyLevel -= 10;
	}
	
}
