package com.edwardim.car;

public class Car {
	// MEMBER VARIABLES
    private String engine;
    private int wheels;
    private boolean automatic;
    private int odometer;
    
    // CLASS VARIABLE
    private static int totalCars = 0;

	
	// CONSTRUCTORS
    public Car() {
    	this.engine = "V4";
    	this.wheels = 4;
    	this.automatic = false;
    	this.odometer = 0;
    	totalCars++;
    }
	public Car(String engine, int wheels, boolean automatic, int odometer) {
		this.engine = engine;
		this.wheels = wheels;
		this.automatic = automatic;
		this.odometer = odometer;
		totalCars++;
	}
	
	// CLASS METHODS
	public static int getTotalCars() {
		return totalCars;
	}
	
	
	// GETTERS / SETTERS / OTHER METHODS
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public boolean isAutomatic() {
		return automatic;
	}
	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}
	public int getOdometer() {
		return odometer;
	}
	public void setOdometer(int odometer) {
		this.odometer = odometer;
	}
	public void drive(int mileage) {
		// TODO Auto-generated method stub
		this.odometer += mileage;
	}
	
}
