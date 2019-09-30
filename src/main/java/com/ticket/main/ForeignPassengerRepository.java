package com.ticket.main;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ticket.main.ticketingasserts.ForeignPassenger;

public interface ForeignPassengerRepository extends MongoRepository<ForeignPassenger, String> {

}
