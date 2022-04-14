package com.edwardim.onemany.controllers;

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

import com.edwardim.onemany.models.Sale;
import com.edwardim.onemany.models.User;
import com.edwardim.onemany.services.MainService;

@Controller
public class MainController {
	
	@Autowired
	private MainService mainServ;
	
	@GetMapping("/sales/new")
	public String newSales(Model model, @ModelAttribute("sale") Sale emptySale) {
		// GET A LIST OF ALL USERS IN DB
		List<User> allUsers = mainServ.getAllUsers();
		// PASS THAT LIST OF USERS TO JSP
		model.addAttribute("users", allUsers);
		
		return "new.jsp";
	}
	
//	@RequestMapping(value="/sales/new", method=RequestMethod.POST)
	@PostMapping("/sales/new")
	public String processSales(
			@Valid @ModelAttribute("sale") Sale filledSale, BindingResult results,
			Model model
	) {
		// CHECK VALIDATIONS
		if(results.hasErrors()) {
			// VALIDATIONS FAILED
			// GET A LIST OF ALL USERS IN DB
			List<User> allUsers = mainServ.getAllUsers();
			// PASS THAT LIST OF USERS TO JSP
			model.addAttribute("users", allUsers);
			
			return "new.jsp";
		}
		else {
			// VALIDATIONS PASSED
			mainServ.createSale(filledSale);
			return "redirect:/sales/new";
		}
	}
	//------------------------------------------------------------------------//
	
	//------------------------------------------------------------------------//
	@GetMapping("/users/{id}")
	public String showUser(@PathVariable("id") Long id, Model model) {
		// GET THE USER FROM THE DB
		User oneUser = mainServ.getOneUser(id);
		// PASS THE USER TO JSP
		model.addAttribute("user", oneUser);
		
		return "user.jsp";
	}
	
}
