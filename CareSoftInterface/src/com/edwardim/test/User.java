package com.edwardim.test;

public class User {
    protected Integer id;
    protected int pin;
    
    public User() {}
    
    public User(Integer id) {
    	this.id = id;
    }

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
