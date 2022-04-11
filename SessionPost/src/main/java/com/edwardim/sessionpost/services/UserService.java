package com.edwardim.sessionpost.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.edwardim.sessionpost.models.User;

@Service
public class UserService {
	// CREATING A USER
	// GET ALL USER
	public List<User> getAllUsers(){
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("Edward", "ed@gmail.com", 30));
		users.add(new User("Jane", "jane@gmail.com", 31));
		users.add(new User("John", "john@gmail.com", 32));
		users.add(new User("Old Man", "old@gmail.com", 72));
		return users;
	}
	// GET ONE USER
	// UPDATE USER
	// DELETE USER
}
