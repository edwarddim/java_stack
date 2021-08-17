package com.edwardim.middlemodel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.edwardim.middlemodel.models.Group;
import com.edwardim.middlemodel.models.User;
import com.edwardim.middlemodel.models.UserGroup;
import com.edwardim.middlemodel.services.MainService;

@Controller
public class MainController {
	
	@Autowired
	private MainService mainServ;
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	// ----------------- CREATING USERS ---------------------//
	@GetMapping("/users/new")
	public String newUser(
			@ModelAttribute("userObj") User emptyUser
	) {
		return "new_user.jsp";
	}
	
	@PostMapping("/users/new")
	public String createUser(
			@ModelAttribute("userObj") User filledUser
	) {
		mainServ.saveUser(filledUser);
		return "redirect:/";
	}
	// ----------------- CREATING USERS ---------------------//
	
	// ----------------- CREATING GROUPS ---------------------//
	@GetMapping("/groups/new")
	public String newGroup(
			@ModelAttribute("groupObj") Group emptyGroup
	) {
		return "new_group.jsp";
	}
	
	@PostMapping("/groups/new")
	public String createGroup(
			@ModelAttribute("groupObj") Group filledGroup
	) {
		mainServ.saveGroup(filledGroup);
		return "redirect:/";
	}
	
	// ----------------- CREATING GROUPS ---------------------//
	// ----------------- DISPLAY A USER AND JOIN A GROUP --------//
	@GetMapping("/users/{id}")
	public String showUser(
			@ModelAttribute("userGroupObj") UserGroup emptyUserGroup,
			@PathVariable("id") Long user_id,
			Model model
	) {
		User oneUser = mainServ.findUser(user_id);
		List<Group> allGroups = mainServ.groupsExcludingUser(oneUser);

		model.addAttribute("user", oneUser);
		model.addAttribute("groups", allGroups);
		return "one_user.jsp";
	}
	
	@PostMapping("/join/process")
	public String joinGroup(
			@ModelAttribute("userGroupObj") UserGroup filledUserGroup
	) {
		mainServ.saveUserGroup(filledUserGroup);
		return "redirect:/users/" + filledUserGroup.getUser().getId();
	}
	
	// ----------------- DISPLAY A USER AND JOIN A GROUP --------//
}
