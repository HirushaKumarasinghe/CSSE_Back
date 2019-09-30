package com.ticket.main.payments;

public class Account {

	private String acountNo;
	private double accountBalance;
	private double creditlimit;
	
	private String _id;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getAcountNo() {
		return acountNo;
	}
	public void setAcountNo(String acountNo) {
		this.acountNo = acountNo;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public double getCreditlimit() {
		return creditlimit;
	}
	public void setCreditlimit(double creditlimit) {
		this.creditlimit = creditlimit;
	}
	
	
}
