package com.edwardim.semiresttv.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.semiresttv.models.Show;
import com.edwardim.semiresttv.repositories.ShowRepository;

@Service
public class ShowService {
//	private final ShowRepository showRepo;
//	
//	public ShowService(ShowRepository showRepo) {
//		this.showRepo = showRepo;
//	}
	@Autowired
	private ShowRepository showRepo;

	// CREATE & UPDATE
	public Show saveShow(Show show) {
		return showRepo.save(show);
	}

	// FIND ALL SHOWS
	public List<Show> allShows() {
		return showRepo.findAll();
	}

	// FIND ONE SHOW
	public Show findOneShow(Long id) {
		return showRepo.findById(id).orElse(null);
	}

	// DELETE A SHOW
	public void deleteShow(Long id) {
		showRepo.deleteById(id);
	}

}
