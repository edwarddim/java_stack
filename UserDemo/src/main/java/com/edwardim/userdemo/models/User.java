package com.edwardim.userdemo.models;

public class User {
	// MEMBER VARIABLES
	private Long id;
	private String name;
	private String email;
	private String password;
	private int age;
	
	// CONSTRUCTORS
	public User() {
		
	}

	public User(String name, int age, String email, String password) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
	}
	
	
	// GETTERS / SETTERS / OTHER METHODS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
