package com.edwardim.onemany.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.onemany.models.Sale;
import com.edwardim.onemany.models.User;
import com.edwardim.onemany.repositories.SaleRepository;
import com.edwardim.onemany.repositories.UserRepository;

@Service
public class MainService {
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private SaleRepository saleRepo;
	
	// --------------------  CRUD FOR USERS ------------------//
	public List<User> allUsers(){
		return userRepo.findAll();
	}
	public User saveUser(User u) {
		return userRepo.save(u);
	}
	
	// --------------------  CRUD FOR SALES ------------------//
	public Sale saveSale(Sale s) {
		return saleRepo.save(s);
	}
	
	
}
