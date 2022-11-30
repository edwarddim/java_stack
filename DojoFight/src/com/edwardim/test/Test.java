package com.edwardim.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ninja naruto = new Ninja("Naruto");
		Wizard gandalf = new Wizard("Gandalf");
		
		
		System.out.println(naruto.attack(gandalf));
		gandalf.displayStats();
		
//		System.out.println(gandalf.attack(naruto));
//		naruto.displayStats();
	}

}
