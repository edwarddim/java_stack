package com.edwardim.test;

import java.util.Random;

public class Ninja extends Human {
	protected int chakra;
	
	
	public Ninja(String name) {
		super(name, 3, 3, 25, 100);
		this.chakra = 100;
	}
	
	
	public int attack(Human target) {
		// CALCULATING THE DAMAGE
		int damage = 5 * this.dex;
		
		// GENERATING A RANDOM NUMBER BETWEEN 0 - 4
		Random random = new Random();
		int randomNumber = random.nextInt(5);
		if(randomNumber == 0) {
			damage += 10;
			System.out.println("CRITICAL");
		}
		target.health -= damage;
		return target.health;
	}

	public int getChakra() {
		return chakra;
	}


	public void setChakra(int chakra) {
		this.chakra = chakra;
	}
	
}
