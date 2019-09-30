package com.ticket.main.ticketingasserts;

public class Manager extends User {
	
	private String _id;
	private String area;

	public Manager(int uidr, String name, String nic, String phone, String address, String email,String area) {
		super(uidr, name, nic, phone, address, email);
		area = this.area;
}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	
}
