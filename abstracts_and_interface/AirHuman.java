package com.edwardim.advancedoop;

public class AirHuman extends Human implements GravityInterface, SwimmingInterface{

	@Override
	public void greeting() {
		// TODO Auto-generated method stub
		System.out.println("A DEEP BOW");
	}

	@Override
	public String giveGift() {
		// TODO Auto-generated method stub
		return "AIR GLIDERS";
	}

	@Override
	public void recieveGift(String gift) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Human human) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fallDown() {
		// TODO Auto-generated method stub
		System.out.println("Glide safely down to Earth");
	}

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		System.out.println("Swimming level is ok");
	}

	@Override
	public void drowning() {
		// TODO Auto-generated method stub
		System.out.println("They float because they are made of air");
	}

}
