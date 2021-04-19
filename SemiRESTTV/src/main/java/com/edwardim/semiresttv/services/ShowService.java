package com.edwardim.semiresttv.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.semiresttv.models.Show;
import com.edwardim.semiresttv.repositories.ShowRepository;

@Service
public class ShowService {
	@Autowired
	private ShowRepository showRepo;
	
	public Show saveShow(Show show) {
		return showRepo.save(show);
	}
	
	public List<Show> allShows(){
		return showRepo.findAll();
	}
	
	public Show findShow(Long id) {
		return showRepo.findById(id).orElse(null);
	}

	public void deleteShow(Long id) {
		showRepo.deleteById(id);
	}
}
