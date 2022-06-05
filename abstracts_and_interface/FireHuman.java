package com.edwardim.advancedoop;

public class FireHuman extends Human implements GravityInterface, SwimmingInterface{
	protected int fireResist;

	public FireHuman(String name, int age, int height,int fireResist) {
		super(name, age, height);
		this.fireResist = fireResist;
	}

	@Override
	public void greeting() {
		System.out.println("HI HO I'M FROM THE FIRE NATION");
	}

	@Override
	public String giveGift() {
		return "FIRE WORKS";
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
		System.out.println("As they fall they can use fire blast to control their fall");
	}

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		System.out.println("Don't like swimming");
	}

	@Override
	public void drowning() {
		if( 5 < SwimmingInterface.neutralBobbingLevel) {
			System.out.println("If there's no life jacket, good luck");			
		}
	}
	
	

}
