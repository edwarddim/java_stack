package com.edwardim.inheritancedemo;

public abstract class Human {
	// MEMBER VARIABLES
	protected String name;
	protected int age;
	protected String gender;
	
//	protected static int numOfHumans; //  CLASS VARIABLE
	// CONSTRUCTOR
	public Human(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
//		numOfHumans++;
	}
	// CLASS METHOD
//	public static void humanPopulation() {
//		System.out.println("Human Population: " + numOfHumans);
//	}
	
	
//	ABSTRACT METHODS
//	METHOD DECLARATION VS IMPLEMENTATION
	public abstract void greeting();
	public abstract void move();
//	public abstract void attack(Human bender);
	
	
	
	// OTHER METHODS
//	public void move() {
//		System.out.println("WALKING");
//	}
	
	// GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
