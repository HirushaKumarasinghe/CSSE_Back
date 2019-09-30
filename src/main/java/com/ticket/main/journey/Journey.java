package com.ticket.main.journey;

import java.util.List;

public class Journey {

	private String _id;
	private int jid;
	private String name;
	private String state;
	List<JourneyState> observer;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public List<JourneyState> getObserver() {
		return observer;
	}
	public void setObserver(List<JourneyState> observer) {
		this.observer = observer;
	}
	
}
