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
		// RETRIEVING ALL USERS FROM DB
		ArrayList<User> usersFromDB = new ArrayList<User>();
		usersFromDB.add(new User("ed@gmail.com", "qwert123", 32));
		usersFromDB.add(new User("jane@gmail.com", "jane123", 35));
		usersFromDB.add(new User("john@gmail.com", "john123", 38));
		return usersFromDB;
	}
	
	// GET ONE USER
	
	// UPDATE A USER
	
	// DELETE A USER
}
