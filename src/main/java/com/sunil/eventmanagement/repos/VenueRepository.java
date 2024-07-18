package com.sunil.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sunil.eventmanagement.entities.Venue;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {

}
