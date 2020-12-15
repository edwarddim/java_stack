package com.edwardim.manydemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.edwardim.manydemo.models.Item;
import com.edwardim.manydemo.models.Purchase;
import com.edwardim.manydemo.models.User;
import com.edwardim.manydemo.services.MainService;

@Controller
public class MainController {
	
	@Autowired
	private MainService mainServ;
//	---------------- LOGIC FOR CREATING A USER ------------------ //
	@GetMapping("/")
	public String index(@ModelAttribute("user") User emptyUser) {
		return "index.jsp";
	}
	@PostMapping("/user/new")
	public String createUser(@ModelAttribute("user") User filledUser ) {
		mainServ.createUser(filledUser);
		return "redirect:/item/new";
	}
//	---------------- LOGIC FOR CREATING A USER ------------------ //
//	---------------- LOGIC FOR CREATING A ITEM ------------------ //
	@GetMapping("/item/new")
	public String newItem(@ModelAttribute("item")Item emptyItem) {
		return "item.jsp";
	}
	@PostMapping("/item/new")
	public String createItem(@ModelAttribute("item")Item filledItem) {
		mainServ.createItem(filledItem);
		return "redirect:/";
	}
//	---------------- LOGIC FOR CREATING A ITEM ------------------ //
	

//	-- LOGIC FOR CREATING RELATIONSHIP BETWEEN USER AND ITEM----- //
	@GetMapping("/user/{user_id}")
	public String showUser(
			@PathVariable("user_id") Long user_id, 
			Model model,
			@ModelAttribute("purchase") Purchase emptyPurchase
		) {
		// GET USER FROM DB USING ID
		User user = mainServ.getUserById(user_id);
		System.out.println(user.getItems());
		model.addAttribute("userObj", user);
		// RETRIEVE ALL ITEMS FROM DB
		List<Item> allItemsFromDB = mainServ.getAllItems();
		model.addAttribute("allItems", allItemsFromDB);
		return "user.jsp";
	}
	@PostMapping("/purchase/new")
	public String userPurchase(@ModelAttribute("purchase") Purchase filledPurchase) {
		mainServ.createPurchase(filledPurchase);
		Long user_id = filledPurchase.getUser().getId();
		String id = String.valueOf(user_id);
		return "redirect:/user/" + id;
	}
//	-- LOGIC FOR CREATING RELATIONSHIP BETWEEN USER AND ITEM----- //
	
//  CREATING RELATIONSHIP BETWEEN USER AND ITEM, NO MIDDLE MODEL //
	@GetMapping("/items/{id}")
	public String itemPurchase(@PathVariable("id")Long id, Model model) {
		Item item = mainServ.findItemById(id);
		List<User> allUsers = mainServ.getAllUsers();
		model.addAttribute("item", item);
		model.addAttribute("users", allUsers);
		return "itemShow.jsp";
	}
	@PostMapping("/items")
	public String processPurchase(
			@RequestParam("user_id") Long user_id,
			@RequestParam("item_id") Long item_id
	) {
		Item item = mainServ.findItemById(item_id);
		User user = mainServ.findUserById(user_id);
		item.getUsers().add(user);
//		user.getItems().add(item);
		mainServ.createItem(item);
		
		String id = String.valueOf(item_id);
		return "redirect:/items/" + id ;
	}
//  CREATING RELATIONSHIP BETWEEN USER AND ITEM, NO MIDDLE MODEL //
	
	
//  DELETING RELATIONSHIP BETWEEN USER AND ITEM, NO MIDDLE MODEL //
	@DeleteMapping("/items")
	public String deletePurchase(
			@RequestParam("item_id") Long item_id,
			@RequestParam("user_id") Long user_id
	) {
		Item item = mainServ.findItemById(item_id);
		User user = mainServ.findUserById(user_id);
		
		item.getUsers().remove(user);
//		user.getItems().remove(item);
		mainServ.createItem(item);
		
		String id = String.valueOf(item_id);
		return "redirect:/items/" + id;
	}
	
}
