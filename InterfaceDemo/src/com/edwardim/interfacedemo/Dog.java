package com.edwardim.interfacedemo;

public class Dog extends Pet implements Adoptable {

	@Override
	public void actCute() {
		// TODO Auto-generated method stub
		System.out.println("Sits next to you");
	}

	@Override
	public void getFed(String food) {
		// TODO Auto-generated method stub
		System.out.println("Wolf down the " + food);
	}
	
}
