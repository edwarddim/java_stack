package com.edwardim.dojofight;

import java.util.ArrayList;
import java.util.Random;

public class Ninja extends Human {
	public Ninja(String name) {
		super(name, 175, 3, 3, 100);
	}
	
	public int attack(Human target) {
		int damage = this.dex * 5;
		int targetHealth = target.getHealth();
		
		// 20% chance to do additional 10 dmg
        // create instance of Random class
        Random rand = new Random();
        
        int chance = rand.nextInt(4); // 0-4
        if(chance == 0) {
        	damage += 10;
        	System.out.println("CRITICAL HIT");
        }
		targetHealth -= damage;
		target.setHealth(targetHealth);
		
		this.health += damage;
		return targetHealth;
	}
	
}
