package com.sunil.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.sunil.eventmanagement.entities.Participant;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {

}
