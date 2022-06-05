package com.edwardim.inheritancedemo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Inheritance");
		
		// INSTANTIATE A HUMNAN
//		Human person = new Human("Edward", 30, "male");
//		Human pesron1 = new Human("Edward", 30, "male");
//		Human person2 = new Human("Edward", 30, "male");
//		System.out.println(person.getName());
//		Human.humanPopulation();

		// INSTANTIATE A AIR HUMNAN
		AirHuman aang = new AirHuman("Aang", 113, "male", 100 );
		System.out.println(aang.getAge());
		System.out.println(aang.getAirResist());
		aang.move();
	}

}
