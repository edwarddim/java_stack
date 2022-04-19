package com.edwardim.recipes.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.edwardim.recipes.models.LoginUser;
import com.edwardim.recipes.models.User;
import com.edwardim.recipes.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public User getOneUser(Long id) {
		return userRepo.findById(id).orElse(null);
	}
	
	
	
	public boolean checkEmailExists(String email) {
		Optional<User> user = userRepo.findByEmail(email);
		
		if(user.isPresent()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public User findUserByEmail(String email) {
		return userRepo.findByEmail(email).orElse(null);
	}
	
	
    public User register(User newUser, BindingResult result) {
    	// TO-DO: Additional validations!
    	//	Is the email already taken?
    	if(this.checkEmailExists(newUser.getEmail())) {
    		result.rejectValue("email", "Exists", "Email already exists");
    	}
    	//	Does the entered password match the confirmation password?
    	if(!newUser.getPassword().equals(newUser.getConfirm())) {
    	    result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
    	}
    	if(result.hasErrors()) {
    		return null;
    	}
    	
    	
    	
    	//	Hashing password and creating a user if no errors
    	String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
    	newUser.setPassword(hashed);
    	
        return userRepo.save(newUser);
    }
    
    
    
    public User login(LoginUser newLoginObject, BindingResult result) {    	
//    	Does a user with that email exist in the database?
    	if(!this.checkEmailExists(newLoginObject.getEmail())) {
    		result.rejectValue("email", "Exists", "INVALID CREDENTIALS");
    		return null;
    	}

    	
    	User user = this.findUserByEmail(newLoginObject.getEmail());
//    	If so, is the password the right password for that email?
    	if(!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
    	    result.rejectValue("password", "Matches", "Invalid Password!");
    	    return null;
    	}

        return user;
    }
	
}
