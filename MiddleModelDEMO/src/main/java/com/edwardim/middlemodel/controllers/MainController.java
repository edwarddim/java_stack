package com.edwardim.middlemodel.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.edwardim.middlemodel.models.Item;
import com.edwardim.middlemodel.models.Purchase;
import com.edwardim.middlemodel.models.User;
import com.edwardim.middlemodel.services.MainService;

@Controller
public class MainController {
	@Autowired
	private MainService mainServ;
	
	// ----------------- CREATE FOR USER --------------------------------//
	@GetMapping("/users/new")
	public String newUser(@ModelAttribute("userObj")User emptyUser) {
		
		System.out.println(mainServ.findUsersWithName("Edward Im"));
		return "newUser.jsp";
	}
	
	@PostMapping("/users/new")
	public String createUser(
			@Valid @ModelAttribute("userObj")User filledUser, BindingResult results
	) {
		if(results.hasErrors()) {
			return "newUser.jsp";
		}
		mainServ.createUser(filledUser);
		return "redirect:/";
	}
	// -------------------------------------------------------------------//
	
	
	// ----------------- CREATE FOR ITEM --------------------------------//
	@GetMapping("/items/new")
	public String newItem(@ModelAttribute("itemObj")Item emptyItem) {
		return "newItem.jsp";
	}
	
	@PostMapping("/items/new")
	public String createItem(
			@Valid @ModelAttribute("itemObj")Item filledItem, BindingResult results
	) {
		if(results.hasErrors()) {
			return "newItem.jsp";
		}
		mainServ.createItem(filledItem);
		return "redirect:/";
	}
	
	@GetMapping("/items/{id}")
	public String item(
		@PathVariable("id")Long id, Model model
	) {
		Item item = mainServ.findItem(id);
		model.addAttribute(item);

		List<User> list = mainServ.findNonPurchasers(item);
		model.addAttribute("users", list);
		
		return "item.jsp";
	}
	// -------------------------------------------------------------------//
	
	@GetMapping("/purchase")
	public String displayPurchase(
			@ModelAttribute("purchaseObj")Purchase emptyPurchase, Model model
	) {
		model.addAttribute("allUsers", mainServ.allUsers());
		model.addAttribute("allItems", mainServ.allItems());
		return "purchase.jsp";
	}
	
	@GetMapping("/purchase/all")
	public String allPurchase(Model model) {
		model.addAttribute("allPurchase", mainServ.allPurchase());
		return "allPurchase.jsp";
	}
	
	@PostMapping("/purchase/new")
	public String processPurchase(@ModelAttribute("purchaseObj")Purchase filledPurchase) {
		mainServ.createPurchase(filledPurchase);
		return "redirect:/purchase";
	}
	
	
	
	
	
	
}
