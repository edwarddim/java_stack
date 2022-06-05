package com.edwardim.manymanydemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.manymanydemo.models.Group;
import com.edwardim.manymanydemo.models.User;
import com.edwardim.manymanydemo.repositories.GroupRepository;
import com.edwardim.manymanydemo.repositories.UserRepository;

@Service
public class MainService {
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private GroupRepository groupRepo;
	
	// CRUD FOR USERS
	public User saveUser(User user) {
		return userRepo.save(user);
	}
	
	
	// CRUD FOR GROUPS
	public Group saveGroup(Group group) {
		return groupRepo.save(group);
	}


	public User findUser(Long id) {
		return userRepo.findById(id).orElse(null);
	}


	public Group findGroup(Long id) {
		return groupRepo.findById(id).orElse(null);
	}
}
