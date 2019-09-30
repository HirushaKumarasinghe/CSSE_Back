package com.ticket.main.tranceport;

import org.springframework.data.annotation.Id;

public class Bus {

	@Id
	private String _id;
	private int bid;
	private String assignedRoot;

	public Bus(int bid, String assignedRoot) {
		super();
		this.bid = bid;
		this.assignedRoot = assignedRoot;
	}
	
	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getAssignedRoot() {
		return assignedRoot;
	}

	public void setAssignedRoot(String assignedRoot) {
		this.assignedRoot = assignedRoot;
	}
}
