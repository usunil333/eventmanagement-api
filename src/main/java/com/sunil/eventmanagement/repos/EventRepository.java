package com.sunil.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sunil.eventmanagement.entities.Event;

public interface EventRepository extends PagingAndSortingRepository<Event, Long> {

}
