package com.ticket.main;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ticket.main.ticketingasserts.User;

public interface UserRepository extends MongoRepository<User, String> {

}
