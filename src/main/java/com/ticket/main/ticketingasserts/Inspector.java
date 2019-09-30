package com.ticket.main.ticketingasserts;

public class Inspector extends User{
	
	private String _id;
	private String employeeId;
	private String assignedRoot;
	
	public Inspector(int uidr, String name, String nic, String phone, String address, String email, String employeeId, String assignedRoot) {
		super(uidr, name, nic, phone, address, email);
		employeeId = this.employeeId;
		assignedRoot = this.assignedRoot;
	}
}
