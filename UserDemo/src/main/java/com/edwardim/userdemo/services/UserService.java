package com.edwardim.userdemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.edwardim.userdemo.models.User;

@Service
public class UserService {
	// CREATE A USER
	
	// GET ALL USERS
	public List<User> getAllUsers(){
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("Ed Im", 15, "ed@gmail.com", "password"));
		users.add(new User("Jane Doe",18, "jane@gmail.com", "password"));
		users.add(new User("John Im",55, "john@gmail.com", "password"));
		return users;
	}
	// GET ONE USER
	
	// UPDATE USER
	
	// DELETE USER
}
