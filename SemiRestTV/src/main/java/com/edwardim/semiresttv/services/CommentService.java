package com.edwardim.semiresttv.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.semiresttv.models.Comment;
import com.edwardim.semiresttv.repositories.CommentRepository;

@Service
public class CommentService {
	@Autowired
	private CommentRepository commentRepo;
	
	public Comment saveComment(Comment c) {
		return commentRepo.save(c);
	}

	public Comment findComment(Long comment_id) {
		return commentRepo.findById(comment_id).orElse(null);
	}

	public void deleteComment(Long comment_id) {
		commentRepo.deleteById(comment_id);
	}
}
