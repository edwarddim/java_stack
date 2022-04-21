package com.edwardim.manydemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.manydemo.models.Item;
import com.edwardim.manydemo.models.Purchase;
import com.edwardim.manydemo.models.User;
import com.edwardim.manydemo.repositories.ItemRepository;
import com.edwardim.manydemo.repositories.PurchaseRepository;
import com.edwardim.manydemo.repositories.UserRepository;

@Service
public class MainService {
	@Autowired
	private UserRepository uRepo;
	
	@Autowired
	private ItemRepository iRepo;
	
	@Autowired
	private PurchaseRepository pRepo;
	
	// USERS
	public User createUser(User filledUser) {
		return uRepo.save(filledUser);
	}
	
	public User getUserById(Long user_id) {
		return uRepo.findById(user_id).orElse(null);
	}
	
	public List<User> getAllUsers() {
		return uRepo.findAll();
	}

	
	// ITEMS
	public Item createItem(Item filledItem) {
		return iRepo.save(filledItem);
	}
	public Item findItemById(Long id) {
		return iRepo.findById(id).orElse(null);
	}

	
	public List<Item> getAllItems() {
		return iRepo.findAll();
	}

	// LIKES - NO MIDDLE MODEL CREATION
	public void createLikes(Long user_id, Long item_id) {
		User user = this.getUserById(user_id);
		Item item = this.findItemById(item_id);
		
		user.getLikes().add(item);
		uRepo.save(user);
//		OR
//		item.getLikes().add(user);
//		iRepo.save(item);
		
	}

	// PURCHASES - MIDDLE MODEL CREATION
	public void createPurchaseModel(Long user_id, Long item_id) {
		User user = this.getUserById(user_id);
		Item item = this.findItemById(item_id);
		
		Purchase newPurchase = new Purchase(user, item);
		pRepo.save(newPurchase);
	}
	



}
