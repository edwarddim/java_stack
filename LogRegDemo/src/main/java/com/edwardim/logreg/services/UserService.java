package com.edwardim.logreg.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.edwardim.logreg.models.LoginUser;
import com.edwardim.logreg.models.User;
import com.edwardim.logreg.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
    private UserRepository userRepo;
    
    // TO-DO: Write register and login methods!
	
	
    public User register(User newUser, BindingResult result) {
    	// TO-DO: Additional validations!
    	//	Is the email already taken?
    	if() {
    		result.rejectValue("email", "Exists", "Email alrady exists");
    	}
    	
    	//	Does the entered password match the confirmation password?
    	if(!newUser.getPassword().equals(newUser.getConfirm())) {
    	    result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
    	}
    	
    	
    	
    	//	Hashing password and creating a user if no errors
    	String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
    	newUser.setPassword(hashed);
    	
        return userRepo.save(newUser);
    }
    
    
    
    public User login(LoginUser newLoginObject, BindingResult result) {
        // TO-DO: Additional validations!
    	
//    	Does a user with that email exist in the database?
    	
//    	If so, is the password the right password for that email?
    	if(!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
    	    result.rejectValue("password", "Matches", "Invalid Password!");
    	}
        return user;
    }
}
