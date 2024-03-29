package com.edwardim.beltreview.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwardim.beltreview.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findAll();
	
	// CUSTOM QUERY - to find user by email
	Optional<User> findByEmail(String email);
}