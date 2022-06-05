package com.edwardim.advancedoop;

public abstract class Human {
	// MEMBERER VARIABLES THAT CAN BE INHERITED	
	protected String name;
	protected int age;
	protected int height;
	
	// CONSTRUCTORS
	
	public Human() {
		
	}
	
	public Human(String name, int age, int height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	// ABSTRACT METHODS - 
	// CREATING A RULE THAT ALL SUBCLASSES MUST IMPLEMENT THESE METHODS
	public abstract void greeting();
	public abstract String giveGift();
	public abstract void recieveGift(String gift);
	public abstract void attack(Human human);

	

	//GETTERS AND SETTERS METHODS
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	
	
	
}
