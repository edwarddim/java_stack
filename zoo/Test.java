package com.edwardim.test;

import com.edwardim.zoo.Bat;
import com.edwardim.zoo.Gorilla;

import java.util.Arrays;


public class Test {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr));
		
		
		// TODO Auto-generated method stub
//		Gorilla joe = new Gorilla();
//		joe.throwSomething();
//		joe.throwSomething();
//		joe.throwSomething();
//		joe.eat();
//		joe.displayEnergy();
		Gorilla joe = new Gorilla();
		Gorilla smoe = new Gorilla();
		Gorilla foe = new Gorilla();
		Gorilla fred = new Gorilla(200);
		
		
		System.out.println(Gorilla.numOfGorillas);
		Bat batman = new Bat();
		batman.displayEnergy();
		batman.fly();
		batman.displayEnergy();
		batman.eatHumans();
		batman.displayEnergy();
	}

}