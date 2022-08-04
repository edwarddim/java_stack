package com.edwardim.beltreview.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LoginUser {
	
	// MEMBER VARIABLES
    @NotEmpty(message="Email is required!")
    @Email(message="Please enter a valid email!")
    private String email;
    
    @NotEmpty(message="Password is required!")
    @Size(min=8, max=128, message="Password must be between 8 and 128 characters")
    private String password;
    
    // EMPTY CONSTRUCTOR
    public LoginUser() {}

    // FULL CONTRUCTOR
	public LoginUser(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
    
    
    
    
    // GETTERS / SETTERS / OTHER METHODS
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
    
}