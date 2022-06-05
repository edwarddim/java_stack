package com.edwardim.middlemodel.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.middlemodel.models.Group;
import com.edwardim.middlemodel.models.User;
import com.edwardim.middlemodel.models.UserGroup;
import com.edwardim.middlemodel.repositories.GroupRepository;
import com.edwardim.middlemodel.repositories.UserGroupRepository;
import com.edwardim.middlemodel.repositories.UserRepository;

@Service
public class MainService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private GroupRepository groupRepo;
	
	@Autowired
	private UserGroupRepository userGroupRepo;
	
	// -------------------- CRUD USER -----------------------------//
	public List<User> allUsers(){
		return userRepo.findAll();
	}
	
	public User saveUser(User u) {
		return userRepo.save(u);
	}
	
	public User findUser(Long user_id) {
		return userRepo.findById(user_id).orElse(null);
	}
	
	// -------------------- CRUD GROUP -----------------------------//
	public List<Group> allGroups(){
		return groupRepo.findAll();
	}
	
	public Group saveGroup(Group g) {
		return groupRepo.save(g);
	}
	
	public Group findGroup(Long group_id) {
		return groupRepo.findById(group_id).orElse(null);
	}
	
	public List<Group> groupsExcludingUser(User u){
		return groupRepo.groupsExcludingUser(u);
	}
	
	// -------------------- CRUD USER GROUP -----------------------------//
	public UserGroup saveUserGroup(UserGroup userGroup) {
		return userGroupRepo.save(userGroup);
	}

}
