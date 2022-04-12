package com.edwardim.userscrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edwardim.userscrud.models.User;
import com.edwardim.userscrud.services.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	private UserService userServ;
	
	@RequestMapping("/api/users")
	public List<User> users() {
		return userServ.allUsers();
	}
	
    @RequestMapping(value="/api/users", method=RequestMethod.POST)
    public User create(
    		@RequestParam(value="firstName") String firstName,
    		@RequestParam(value="lastName") String lastName, 
    		@RequestParam(value="email") String email
    ) {
        User user = new User(firstName, lastName, email);
        return userServ.create(user);
    }
    
    @RequestMapping("/api/users/{id}")
    public User show(@PathVariable("id") Long id) {
        User oneUser = userServ.oneUser(id);
        return oneUser;
    }
}
