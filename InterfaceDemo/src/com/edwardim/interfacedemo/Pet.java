package com.edwardim.interfacedemo;

public class Pet {
	// MEMBER VARIABLES
	protected String name;
	protected int age;
	// CONSTRUCTORS
	
	public Pet() {
		
	}
	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	// GETTERS / SETTERS / OTHER METHODS
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
	

	
	
	// IMPLEMENT THE INTERFACE METHODS
	
}
