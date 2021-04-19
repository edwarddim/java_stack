package com.edwardim.middlemodel.services;

import java.util.ArrayList;
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

	public Item findItem(Long id) {
		return itemRepo.findById(id).orElse(null);
	}
	
	public List<User> findNonPurchasers(Item item){
		// GENERATE LIST OF USERS WHO HAVE BOUGHT THIS ITEM
		ArrayList<Long> ids = new ArrayList<Long>();
		for(Purchase p : item.getOrders()) {
			ids.add(p.getPurchaser().getId());
		}
		// QUERY THE LIST OF USERS WHO BOUGHT ITEM AGAINST ALL PURCHASES
		return userRepo.findByIdNotIn(ids);
	}
	
	
}
