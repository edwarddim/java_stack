package com.edwardim.car;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car edwardCar = new Car();
		Car testCar = new Car("V8", 4, false, 100);
		
		
//        System.out.println(edwardCar.getOdometer());
//        edwardCar.drive(15);
//        edwardCar.drive(15);
//        System.out.println(edwardCar.getOdometer());
		System.out.println(Car.getTotalCars());
	}

}
