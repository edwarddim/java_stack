package com.edwardim.manymanydemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.edwardim.manymanydemo.models.Group;
import com.edwardim.manymanydemo.models.User;
import com.edwardim.manymanydemo.services.MainService;

@Controller
public class MainController {
	@Autowired
	private MainService mainServ;
	
	@GetMapping("/add")
	public String createRelationnship() {
		// GRAB THE USER USING ID
		User user = mainServ.findUser(new Long(12));
		// GRAB THE GROUP USING ID
		Group group = mainServ.findGroup(new Long(2));
		// CREATE THE RELATIONSHIP BETWEEN THE USER AND GROUP
		user.getGroups().add(group);
		// NEED TO UPDATE THE DB WITH THE NEW USER INFO
		mainServ.saveUser(user);
		
//		group.getMembers().add(user);
//		mainServ.saveGroup(group);
		return "redirect:/";
	}
	
	@GetMapping("/remove")
	public String deletingRelationship() {
		// GRAB THE USER USING ID
		User user = mainServ.findUser(new Long(12));
		// GRAB THE GROUP USING ID
		Group group = mainServ.findGroup(new Long(2));
		// REMOVING THE RELATIONSHIP BETWEEN THE USER AND GROUP
		user.getGroups().remove(group);
		// NEED TO UPDATE THE DB WITH THE NEW USER INFO
		mainServ.saveUser(user);
		
//		group.getMembers().remove(user);
//		mainServ.saveGroup(group);
		return "redirect:/";
	}
}
