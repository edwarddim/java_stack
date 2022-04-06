package com.edwardim.inheritancedemo;

public class FireHuman extends Human implements GravityInterface, SwimmingInterface {

	@Override
	public void movement() {
		System.out.println(GravityInterface.gravity);
		System.out.println("Run");
	}

	@Override
	public void swim() {
		System.out.println("Waddle");
	}

}
