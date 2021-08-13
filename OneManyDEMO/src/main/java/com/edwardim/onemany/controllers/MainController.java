package com.edwardim.onemany.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.edwardim.onemany.models.Sale;
import com.edwardim.onemany.models.User;
import com.edwardim.onemany.services.MainService;

@Controller
public class MainController {
	
	@Autowired
	private MainService mainServ;
	
	@GetMapping("/")
	public String index(@ModelAttribute("userObj") User emptyUser) {
		return "index.jsp";
	}
	
	@PostMapping("/users/new")
	public String create(
			@ModelAttribute("userObj") User filledUser
	) {
		mainServ.saveUser(filledUser);
		return "redirect:/";
	}
	
	@GetMapping("/sales/new")
	public String sales(
			@ModelAttribute("salesObj") Sale emptyObj,
			Model model
	) {
		// GRAB ALL EMPLOYEES FROM DB
		List<User> allEmployees = mainServ.allUsers();
		// PASS THE EMPLOYESS TO JSP
		model.addAttribute("employees", allEmployees);
		
		return "sales.jsp";
	}
	
	@PostMapping("/sales/new")
	public String createSale(
			@ModelAttribute("salesObj") Sale filledObj
	) {
		mainServ.saveSale(filledObj);
		return "redirect:/sales";
	}
	
	@GetMapping("/sales")
	public String salesDash(
			Model model
	) {
		// GRAB ALL EMPLOYEES FROM DB
		List<User> allEmployees = mainServ.allUsers();
		// PASS THE EMPLOYESS TO JSP
		model.addAttribute("employees", allEmployees);
		return "salesDash.jsp";
	}
	
}
