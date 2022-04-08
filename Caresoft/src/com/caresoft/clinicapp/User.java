package com.caresoft.clinicapp;

public class User {
	// MEMBER VARIABLES
    protected Integer id;
    protected int pin;
    
    // CONSTRUCTORS
    
    public User() {
    	
    }
    
    public User(Integer id) {
    	this.id = id;
    }
    
    // GETTERS / SETTERS / OTHER METHODS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
}
