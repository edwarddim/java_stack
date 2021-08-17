package com.edwardim.middlemodel.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwardim.middlemodel.models.User;
import com.edwardim.middlemodel.models.UserGroup;

@Repository
public interface UserGroupRepository extends CrudRepository<UserGroup, Long> {
	List<UserGroup> findAll();
}
