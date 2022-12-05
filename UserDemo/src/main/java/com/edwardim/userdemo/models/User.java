package com.edwardim.userdemo.models;

import java.util.Date;

public class User {
	// MEMBER VARIABLES
	private Long id;
	
	private String email;
	private String password;
	private int age;
	
	private Date createdAt;
	private Date updatedAt;
	
	// CONSTRUCTOR
	// EMPTY CONSTRUCTOR
	public User() {}
	// FULL CONSTRUCTOR
	public User(String email, String password, int age) {
		this.email = email;
		this.password = password;
		this.age = age;
	}
	// GETTERS / SETTERS / OTHER METHODS
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
