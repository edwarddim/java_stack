package com.edwardim.semiresttv.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edwardim.semiresttv.models.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {
	
}
