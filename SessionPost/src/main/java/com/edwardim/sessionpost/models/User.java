package com.edwardim.sessionpost.models;

public class User {
	// MEMBER VARIABLES
	private String name;
	private String email;
	private int age;

	
	// CONSTRUCTORS
	public User() {
		
	}
	
	public User(String name, String email, int age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}
	// GETTERS / SETTERS / OTHER METHODS

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
