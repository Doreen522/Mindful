package com.mindfull.ptest.Repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.mindfull.ptest.model.Event;

public interface eventRepository extends MongoRepository<Event, String> {

////	Event findByDate();
////
////	Event findByDate(String eventDate);
////
////	Event findByPrice(String eventPrice);

}
