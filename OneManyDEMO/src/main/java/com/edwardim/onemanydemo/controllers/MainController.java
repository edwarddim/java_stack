package com.edwardim.onemanydemo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.edwardim.onemanydemo.models.Post;
import com.edwardim.onemanydemo.models.User;
import com.edwardim.onemanydemo.services.MainService;

@Controller
public class MainController {
	
	public final MainService mainServ;
	
	public MainController(MainService mainServ) {
		this.mainServ = mainServ;
	}
	
	@GetMapping("")
	public String index(@ModelAttribute("userObj")User emptyObj) {
		return "index.jsp";
	}
	
	@PostMapping("/users/new")
	public String newUser(
		@Valid @ModelAttribute("userObj") User filledObj, BindingResult results
	) {
		// CHECK FOR VALIDATIONS
		if(results.hasErrors()) {
			// VALIDATIONS DON'T PASS, DISPLAY ERROR MESSAGES
			return "index.jsp";
		}
		else {
			// VALIDATIONS PASS, CREATE USER
			mainServ.createUser(filledObj);
			return "redirect:/";
		}
	}
	
	@GetMapping("/posts")
	public String posts(
		@ModelAttribute("postObj")Post emptyObj, Model model
	) {
		List<User> allUsers = mainServ.allUsers();
		model.addAttribute("allUsers", allUsers);
		return "posts.jsp";
	}
	
	
	
}
