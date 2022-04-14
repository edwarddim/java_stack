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
	// IMPORT THE TWO REPOS
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private SaleRepository saleRepo;
	
	// CREATE USER
	public User createUser(User newUser) {
		return userRepo.save(newUser);
	}
	// GET ALL USER
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	// GET ONE USER
	public User getOneUser(Long id) {
		return userRepo.findById(id).orElse(null);
	}
	
	
	// CREATE SALE
	public Sale createSale(Sale newSale) {
		return saleRepo.save(newSale);
	}
	// GET ALL SALE
	public List<Sale> getAllSales(){
		return saleRepo.findAll();
	}
	// GET ONE SALE
	public Sale getOneSales(Long id) {
		return saleRepo.findById(id).orElse(null);
	}
	
}
