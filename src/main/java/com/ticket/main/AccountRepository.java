package com.ticket.main;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ticket.main.payments.Account;

public interface AccountRepository extends MongoRepository<Account, String>{

}
