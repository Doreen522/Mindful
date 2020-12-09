package com.mindfull.ptest.serviceImplementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindfull.ptest.Repository.eventRepository;
import com.mindfull.ptest.model.Event;
import com.mindfull.ptest.service.eventService;


@Service
public class eventServiceImpl implements eventService {
	
    @Autowired
	eventRepository eventRepo;

	@Override
	public Event createEvent(Event event) {
		
		return eventRepo.save(event);
	}

////	@Override
////	public Event getEventByDate(String eventDate) {
////		Event event= eventRepo.findByDate(eventDate);
////		return event;
////	}
////
////	@Override
////	public Event getEventByPrice(String eventPrice) {
////		Event event =eventRepo.findByPrice(eventPrice);
////		return event;
////	}
//
	@Override
	public Event getEvent(String eventId) {
		Event event=eventRepo.findById(eventId) .get();
		return event;
	}
  


}
