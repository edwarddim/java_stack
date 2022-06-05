package com.edwardim.logregdemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwardim.logregdemo.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findAll();
	// CREATE A QUERY TO FIND USER BY EMAIL
	User findByEmail(String email);
}
