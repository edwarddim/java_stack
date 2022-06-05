package com.edwardim.inheritancedemo;

public class FireHuman extends Human implements SwimmingInterface, GravityInterface {

	protected int fireResist;
	public FireHuman(String name, int age, String gender, int fireResist) {
		super(name, age, gender);
		this.fireResist = fireResist;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void greeting() {
		System.out.println("NO GREETINGS, JUST ATTACK");
	}

	@Override
	public void move() {
		System.out.println("USE FIRE BLAST TO FLY");
	}

	@Override
	public void swimming() {
		System.out.println("DONT LIKE SWIMMING, I NEED A BOAT");
		
	}

	@Override
	public void fly() {
		System.out.println("FLYING IS POSSIBLE, BUT DIFFICULT TO MANAGE");
	}


}
