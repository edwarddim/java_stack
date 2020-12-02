package com.edwardim.zoo;

public class Gorilla extends Mammal {
//	MEMBER VARIABLES

//	CLASS VARIABLES
	public static int numOfGorillas = 0;

//	CONSTRUCTORS
	public Gorilla() {
		super();
		numOfGorillas++;
	}
	public Gorilla(int energyLevel) {
		super(energyLevel);
		numOfGorillas++;
	}
	
//	GETTERS AND SETTERS
//	OTHER METHODS
	public void throwSomething() {
//		TAKE THE ENERGY LEVEL AND SUBTRACT
		System.out.println("GORILLA THREW SOMETHING");
		this.energyLevel -= 5;
	}
	public void eat() {
		System.out.println("GORILLA EATING A BANANA");
		this.energyLevel += 10;
	}
	
}
