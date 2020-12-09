package com.mindfull.ptest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindfull.ptest.model.Event;
import com.mindfull.ptest.service.eventService;


@RequestMapping(value="/event")
@RestController
public class eventController {
	
	@Autowired
	eventService eventServ;
	
	@GetMapping("/eventId/{eventId}")
	public Event getEvent(@PathVariable String eventId) {
		return eventServ.getEvent(eventId);
	}
	
	@RequestMapping (value="/" , method=RequestMethod.POST)
	public Event createNewEvent(@RequestBody Event event) {
		return eventServ.createEvent(event);
	}
	

}
