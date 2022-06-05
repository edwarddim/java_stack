package com.edwardim.onemanydemo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edwardim.onemanydemo.models.Post;
import com.edwardim.onemanydemo.models.User;
import com.edwardim.onemanydemo.repositories.PostRepository;
import com.edwardim.onemanydemo.repositories.UserRepository;

@Service
public class MainService {
	
	public final UserRepository userRepo;
	public final PostRepository postRepo;
	
	public MainService(UserRepository userRepo, PostRepository postRepo) {
		this.userRepo = userRepo;
		this.postRepo = postRepo;
	}
	
	// --------- CRUD OPERATIONS FOR USER --------------//
	
	//CREATING A USER
	public User createUser(User newUser) {
		return userRepo.save(newUser);
	}
	
	// READ ONE USER
	public User getUser(Long id) {
		return userRepo.findById(id).orElse(null);
		
//		Optional<User> user = userRepo.findById(id);
//		if(user.isPresent()) {
//			return user.get();
//		}
//		else {
//			return null;
//		}
	}
	
	// ---------- CRUD OPERATIONS FOR POST -------------//
	
	// CREATING A POST
	public Post createPost(Post newPost) {
		return postRepo.save(newPost);
	}
	
	// GET ALL POSTS
	public List<Post> getAllPosts(){
		return postRepo.findAll();
	}
	
	// GET A POST BY ID
	public Post getPost(Long id) {
		return postRepo.findById(id).orElse(null);
	}

	public List<User> allUsers() {
		return userRepo.findAll();
	}
	
}
