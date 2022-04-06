package com.edwardim.interfacedemo;

public class Cat extends Pet implements Adoptable {

	@Override
	public void actCute() {
		// TODO Auto-generated method stub
		System.out.println("Paw at your face");
	}

	@Override
	public void getFed(String food) {
		// TODO Auto-generated method stub
		System.out.println("Eat like a cat " + food);
	}

}
