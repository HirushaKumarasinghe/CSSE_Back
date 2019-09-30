package com.ticket.main.ticketingasserts;

public class LocalPassenger extends User{


	private String _id;
	private double accountBalance;
	private int accountNo;
	
	public LocalPassenger(int uidr, String name, String nic, String phone, String address, String email,double accountBalance, int accountNo) {
		super(uidr, name, nic, phone, address, email);
		accountBalance = this.accountBalance;
		accountNo = this.accountNo; 
		}
}
