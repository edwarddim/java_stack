package com.edwardim.belt.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.belt.models.Event;
import com.edwardim.belt.repositories.EventRepository;

@Service
public class MainService {
	@Autowired
	private EventRepository eRepo;

	public void createEvent(@Valid Event filledEvent) {
		eRepo.save(filledEvent);
	}

	public List<Event> getAllEvents() {
		return eRepo.findAll();
	}

	public Event findEvent(Long id) {
		return eRepo.findById(id).orElse(null);
	}

	public void deleteEvent(Long id) {
		eRepo.deleteById(id);
	}
}
