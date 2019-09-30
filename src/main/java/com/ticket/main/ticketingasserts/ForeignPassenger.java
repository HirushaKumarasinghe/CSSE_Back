package com.ticket.main.ticketingasserts;

public class ForeignPassenger extends User {


	private String _id;
	private String passportId;
	private String creditcardId;

	
	public ForeignPassenger(int uidr, String name, String nic, String phone, String address, String email, String passportId, String creditcardId) {
		super(uidr, name, nic, phone, address, email);
		passportId = this.passportId;
		creditcardId = this.creditcardId;	}
}
