package com.ticket.main;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ticket.main.journey.Journey;

public interface JourneyRepository extends MongoRepository<Journey, String> {

}
