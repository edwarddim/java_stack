package com.edwardim.belt.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.edwardim.belt.models.Event;
import com.edwardim.belt.services.MainService;

@Controller
public class MainController {
	@Autowired
	private MainService mainServ;
// --------------- CREATE ----------------------- //	
	@GetMapping("/events")
	public String index(
			@ModelAttribute("event")Event emptyEvent, 
			HttpSession session,
			Model model
	) {
		Long user_id = (Long) session.getAttribute("user_id");
		List<Event> allEvents = mainServ.getAllEvents();
		model.addAttribute("user_id", user_id);
		model.addAttribute("events", allEvents);
		return "dashboard.jsp";
	}
	
	@PostMapping("/events/new")
	public String createEvent(
			@Valid @ModelAttribute("event")Event filledEvent, BindingResult results,
			HttpSession session,
			Model model
	) {
		if(results.hasErrors()) {
			Long user_id = (Long) session.getAttribute("user_id");
			List<Event> allEvents = mainServ.getAllEvents();
			model.addAttribute("user_id", user_id);
			model.addAttribute("events", allEvents);
			return "dashboard.jsp";
		}
//		CREATE A NEW EVENT
		mainServ.createEvent(filledEvent);
//		REDIRECT YOU BACK TO DASHBOARD
		return "redirect:/events";
	}
// --------------- CREATE ----------------------- //	
	
// --------------- SHOW   ----------------------- //
	@GetMapping("/events/{id}")
	public String show(@PathVariable("id")Long id, Model model) {
		Event event = mainServ.findEvent(id);
		model.addAttribute("event", event);
		return "event.jsp";
	}
// --------------- SHOW   ----------------------- //	
	
// --------------- EDIT   ----------------------- //
	@GetMapping("/events/{id}/edit")
	public String editShow(@PathVariable("id")Long id, Model model) {
		Event editEvent = mainServ.findEvent(id);
		model.addAttribute("event", editEvent);
		return "edit.jsp";
	}
	@PutMapping("/events/{id}/edit")
	public String processEditShow(
			@Valid @ModelAttribute("event")Event filledEvent, BindingResult results
	) {
		if(results.hasErrors()) {
			return "edit.jsp";
		}
//		UPDATE THE EVENT
		mainServ.createEvent(filledEvent);
//		REDIRECT TO DASHBOARD
		return "redirect:/events";
	}
	
// --------------- EDIT   ----------------------- //
	
// --------------- DELETE  ---------------------- //	
	@GetMapping("/events/{id}/delete")
	public String deleteEvent(@PathVariable("id")Long id) {
		mainServ.deleteEvent(id);
		return "redirect:/events";
	}
// --------------- DELETE  ---------------------- //
	
	
}
