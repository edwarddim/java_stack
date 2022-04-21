package com.edwardim.manydemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.edwardim.manydemo.models.Item;
import com.edwardim.manydemo.models.User;
import com.edwardim.manydemo.services.MainService;

@Controller
public class MainController {
	@Autowired
	private MainService mainServ;
	
	
	@GetMapping("/users/new")
	public String newUser(@ModelAttribute("user") User emptyUser) {
		return "newUser.jsp";
	}
	
	@PostMapping("/users/new")
	public String createUser(@ModelAttribute("user") User filledUser) {
		mainServ.createUser(filledUser);
		return "redirect:/users/new";
	}
	
	
	@GetMapping("/items/new")
	public String newItem(@ModelAttribute("item")Item emptyItem) {
		return "newItem.jsp";
	}
	
	@PostMapping("/items/new")
	public String createItems(@ModelAttribute("item")Item filledItem) {
		mainServ.createItem(filledItem);
		return "redirect:/items/new";
	}
	
	@GetMapping("/purchases/new")
	public String showPurchase(Model model) {
		List<User> allUsers = mainServ.getAllUsers();
		List<Item> allItems = mainServ.getAllItems();
		
		model.addAttribute("users", allUsers);
		model.addAttribute("items", allItems);
		
		return "purchase.jsp";
	}
	
	@PostMapping("/purchases/new")
	public String createPurchase(
			@RequestParam("user_id") Long user_id,
			@RequestParam("item_id") Long item_id
	) {		
		mainServ.createPurchaseModel(user_id, item_id);
		
		return "redirect:/purchases/new";
	}
}
