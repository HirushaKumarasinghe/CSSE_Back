package com.ticket.main.ticketingasserts;

import org.springframework.data.annotation.Id;

public class User {

	@Id
	private String _id;
	protected int uidr;
	protected String name;
	protected String nic;
	protected String phone;
	protected String address;
	protected String email;
	

	public User(int uidr, String name, String nic, String phone, String address, String email) {
		super();
		this.uidr = uidr;
		this.name = name;
		this.nic = nic;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}


	public String get_id() {
		return _id;
	}


	public void set_id(String _id) {
		this._id = _id;
	}


	public int getUidr() {
		return uidr;
	}


	public void setUidr(int uidr) {
		this.uidr = uidr;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNic() {
		return nic;
	}


	public void setNic(String nic) {
		this.nic = nic;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
