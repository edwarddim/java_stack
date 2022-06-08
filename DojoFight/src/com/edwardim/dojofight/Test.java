package com.edwardim.dojofight;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human edward = new Human("Edward");
		
		Human john = new Human("John");
		
		Wizard gandolf = new Wizard("Gandolf");
		Wizard harry = new Wizard("Harry Potter");
		
		Ninja naruto = new Ninja("Ninja");
		
		
//		System.out.println(john.getHealth());
//		edward.attack(john);
//		edward.attack(john);
//		
//		System.out.println(john.getHealth());
		
//		harry.displayStats();
//		gandolf.displayStats();
//		
//		
//		gandolf.attack(harry);
//		
//		
//		gandolf.displayStats();
//		harry.displayStats();
		
		naruto.attack(edward);
		edward.displayStats();
	}

}
