package com.edwardim.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edwardim.mvc.models.User;
import com.edwardim.mvc.repositories.UserRepository;

@Service
public class MainService {
	private final UserRepository userRepo;
	
	
	public MainService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	// CRUD OPERATIONS
	
	// RETRIEVE ALL OF USERS
	public List<User> allUsers(){
		return userRepo.findAll();
	}
	
	// CREATING A USER
	public User createUser(User user) {
		return userRepo.save(user);
	}
	
	// GRAB A USER BY ID
	public User findUser(Long id) {
		return userRepo.findById(id).orElse(null);
		
		
//        Optional<User> optionalUser = userRepo.findById(id);
//        if(optionalUser.isPresent()) {
//            return optionalUser.get();
//        } else {
//            return null;
//        }
	}
		
}
