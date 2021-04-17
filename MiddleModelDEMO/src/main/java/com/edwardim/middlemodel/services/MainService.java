package com.edwardim.middlemodel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.middlemodel.models.Item;
import com.edwardim.middlemodel.models.Purchase;
import com.edwardim.middlemodel.models.User;
import com.edwardim.middlemodel.repositories.ItemRepository;
import com.edwardim.middlemodel.repositories.PurchaseRepository;
import com.edwardim.middlemodel.repositories.UserRepository;

@Service
public class MainService {
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private ItemRepository itemRepo;
	
	@Autowired
	private PurchaseRepository purchaseRepo;

	public User createUser(User filledUser) {
		return userRepo.save(filledUser);
		
	}
	
	public List<User> allUsers() {
		return userRepo.findAll();
	}
	
	public List<User> findUsersWithName(String name){
		return userRepo.findByname(name);
	}
	
	
	// ------------------------------- //
	public Item createItem(Item item) {
		return itemRepo.save(item);
	}
	
	public List<Item> allItems(){
		return itemRepo.findAll();
	}

	public void createPurchase(Purchase filledPurchase) {
		purchaseRepo.save(filledPurchase);
		
	}

	public List<Purchase> allPurchase() {
		return purchaseRepo.findAll();
	}
	
	
}
