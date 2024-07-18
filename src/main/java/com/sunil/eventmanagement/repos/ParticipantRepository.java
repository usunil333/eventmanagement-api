package com.sunil.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sunil.eventmanagement.entities.Participant;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {

}
