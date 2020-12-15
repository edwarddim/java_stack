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

	public User createUser(User filledUser) {
		return uRepo.save(filledUser);
	}

	public Item createItem(Item filledItem) {
		return iRepo.save(filledItem);
	}

	public User getUserById(Long user_id) {
		return uRepo.findById(user_id).orElse(null);
	}

	public List<Item> getAllItems() {
		return iRepo.findAll();
	}

	public void createPurchase(Purchase filledPurchase) {
		pRepo.save(filledPurchase);
	}

	public Item findItemById(Long id) {
		return iRepo.findById(id).orElse(null);
	}

	public List<User> getAllUsers() {
		return uRepo.findAll();
	}

	public User findUserById(Long user_id) {
		return uRepo.findById(user_id).orElse(null);
	}
	
	
}
