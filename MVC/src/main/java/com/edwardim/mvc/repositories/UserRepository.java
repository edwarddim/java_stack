package com.edwardim.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwardim.mvc.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	// WE DFEINE QUERIES THAT RETRIEVE INFORMATION
	List<User> findAll();
	
	
}
