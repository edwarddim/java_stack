package com.edwardim.semiresttv.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.semiresttv.models.Show;
import com.edwardim.semiresttv.repositories.ShowRepository;

@Service
public class MainService {
	@Autowired
	private ShowRepository sRepo;

	public Show createShow(@Valid Show filledShow) {
		return sRepo.save(filledShow);
	}

	public Show findShowById(Long id) {
		return sRepo.findById(id).orElse(null);
	}
	
	
}
