package com.sunil.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.sunil.eventmanagement.entities.Venue;

public interface VenueRepository extends CrudRepository<Venue, Long> {

}
