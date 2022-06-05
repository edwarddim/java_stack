package com.edwardim.semiresttv.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.edwardim.semiresttv.models.User;
import com.edwardim.semiresttv.services.UserService;
import com.edwardim.semiresttv.validators.UserValidator;

@Controller
public class UserController {
	@Autowired
	private UserService userServ;
	
	@Autowired
	private UserValidator userValid;
	
	@GetMapping("")
	public String index(@ModelAttribute("userObj")User emptyUser) {
		return "logReg.jsp";
	}
	
	@PostMapping("/registration")
	public String register(
			@Valid @ModelAttribute("userObj") User filledUser, BindingResult results,
			HttpSession session
	) {
		// RUN OUR CUSTOM VALIDATIONS
		userValid.validate(filledUser,results );
		// CHECK TO SEE IF THERE ARE VALIDATIONS ERRORS
		if(results.hasErrors()) {
			return "logReg.jsp";
		}
		else {
			// CREATE USER
			User newUser = userServ.registerUser(filledUser);
			session.setAttribute("user_id", newUser.getId());
			// RETURN REDIRECT TO HOME
			return "redirect:/shows";
		}
	}
	
	@PostMapping("/login")
	public String login(
			@RequestParam("email") String email,@RequestParam("password") String password,
			HttpSession session, RedirectAttributes redirectAttributes
	) {
		// CHECK TO SEE IF EMAIL AND PASSWORD MATCH
		if(userServ.authenticateUser(email, password)) {
			User user = userServ.findByEmail(email);
			session.setAttribute("user_id", user.getId());
			 return "redirect:/shows";
		}
		else {
			redirectAttributes.addFlashAttribute("error", "INVALID CREDENTIALS");
			return "redirect:/";
		}
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
