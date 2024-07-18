package com.sunil.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sunil.eventmanagement.entities.Organizer;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}
