package com.sunil.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.sunil.eventmanagement.entities.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

}
