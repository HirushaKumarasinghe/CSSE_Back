package com.ticket.main.journey;

public class JourneyState {

	private String name;
	private String assignedRoot;
	Journey journey;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAssignedRoot() {
		return assignedRoot;
	}
	public void setAssignedRoot(String assignedRoot) {
		this.assignedRoot = assignedRoot;
	}
	public Journey getJourney() {
		return journey;
	}
	public void setJourney(Journey journey) {
		this.journey = journey;
	}
	
	
}
