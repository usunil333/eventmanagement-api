package com.sunil.eventmanagement.entities;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Organizer extends AbstractEntity {
	private String name;

	@OneToMany(mappedBy = "organizer")
	private Set<Event> events;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Event> getEvents() {
		return events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}

	public Long getResourceId() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return Objects.equals(id, ((Organizer) obj).id);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id);
	}

}
