package com.edwardim.otm.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwardim.otm.models.Chef;

@Repository
public interface ChefRepository extends CrudRepository<Chef, Long> {
	List<Chef> findAll();
}
