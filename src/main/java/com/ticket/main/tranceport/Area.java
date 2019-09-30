package com.ticket.main.tranceport;

import org.springframework.data.annotation.Id;

public class Area {

	@Id
	private String _id;
	private String rid;
	private String name;
	private String assignedRoot;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
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
}
