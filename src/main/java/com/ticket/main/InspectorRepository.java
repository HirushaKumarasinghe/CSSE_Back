package com.ticket.main;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.ticket.main.ticketingasserts.Inspector;

public interface InspectorRepository extends MongoRepository<Inspector, String> {

}
