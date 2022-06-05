package com.edwardim.logregdemo.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.edwardim.logregdemo.models.User;
import com.edwardim.logregdemo.services.UserService;

@Component
public class UserValidator implements Validator {
	
	@Autowired
	private UserService userServ;

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// CONVERT INCOMING TARGET FROM OBJECT TO USER
		User user = (User) target;
		// CHECK TO SEE IF PASSWORD AND CONFIRM PASSWORD MATCH
		if( ! user.getPassword().equals(user.getPasswordConfirmation())) {
			errors.rejectValue("passwordConfirmation", "Match");
		}
		// CHECK TO SEE IF EMAIL IS UNIQUE
		if(userServ.findByEmail(user.getEmail()) != null) {
			errors.rejectValue("duplicate", "Duplicate");
		}
	}
	
}
