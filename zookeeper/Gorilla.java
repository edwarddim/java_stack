package com.edwardim.zookeeper;

public class Gorilla extends Mammal {

	public Gorilla() {
		super();
	}
	
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	
	public void throwSomething() {
		System.out.println("WOOOOOSH");
		this.energyLevel -= 5;
	}
	public void eatBananas() {
		System.out.println("NOM NOM NOM");
		this.energyLevel += 10;
	}
	public void climb() {
		System.out.println("GORILLA CLIMBED");
		this.energyLevel -= 10;
	}

}
