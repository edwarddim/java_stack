package com.edwardim.userdemo.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.userdemo.models.User;
import com.edwardim.userdemo.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	// CREATE A USER
	public User create(User newUser) {
		return userRepo.save(newUser);
	}
	
	// GET ALL USERS
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	// GET ONE USER
	public User getOneUser(Long id) {
		return userRepo.findById(id).orElse(null);
	}
	// UPDATE USER

	public User updateUser(@Valid User updatedUser) {
		return userRepo.save(updatedUser);
	}
	
	// DELETE USER
	public void deleteUser(Long id) {
		userRepo.deleteById(id);
	}
}
