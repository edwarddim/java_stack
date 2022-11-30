package com.edwadim.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human pleb = new Human();
		AirBender aang = new AirBender("Aang", 14, 80, 200);
		System.out.println(aang.getName());
		System.out.println(aang.getHealth());
		System.out.println(aang.getAge());
		System.out.println(aang.getAirResistance());
		aang.movement();
	}
}
