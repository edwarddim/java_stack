package com.edwardim.middlemodel.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwardim.middlemodel.models.Group;

@Repository
public interface GroupRepository extends CrudRepository<Group, Long> {
	List<Group> findAll();
}
