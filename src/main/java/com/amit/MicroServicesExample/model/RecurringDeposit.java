package com.amit.MicroServicesExample.model;


public class RecurringDeposit {
	private int id;
	private String rdname;
	private boolean rdaccountexist;
	private String rdaccountname;
	private long rdaccountnumber;
	private String rdaddress;
	private long rdnumber;
	private double rdamount;
	private String time;
	private double rdintrest;
	private String rdnominee;
	//private Receipt rdreceipt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRdname() {
		return rdname;
	}
	public void setRdname(String rdname) {
		this.rdname = rdname;
	}
	public boolean isRdaccountexist() {
		return rdaccountexist;
	}
	public void setRdaccountexist(boolean rdaccountexist) {
		this.rdaccountexist = rdaccountexist;
	}
	public String getRdaccountname() {
		return rdaccountname;
	}
	public void setRdaccountname(String rdaccountname) {
		this.rdaccountname = rdaccountname;
	}
	public long getRdaccountnumber() {
		return rdaccountnumber;
	}
	public void setRdaccountnumber(long rdaccountnumber) {
		this.rdaccountnumber = rdaccountnumber;
	}
	public String getRdaddress() {
		return rdaddress;
	}
	public void setRdaddress(String rdaddress) {
		this.rdaddress = rdaddress;
	}
	public long getRdnumber() {
		return rdnumber;
	}
	public void setRdnumber(long rdnumber) {
		this.rdnumber = rdnumber;
	}
	public double getRdamount() {
		return rdamount;
	}
	public void setRdamount(double rdamount) {
		this.rdamount = rdamount;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getRdintrest() {
		return rdintrest;
	}
	public void setRdintrest(double rdintrest) {
		this.rdintrest = rdintrest;
	}
	public String getRdnominee() {
		return rdnominee;
	}
	public void setRdnominee(String rdnominee) {
		this.rdnominee = rdnominee;
	}

	/*
	 * public Receipt getRdreceipt() { return rdreceipt; } public void
	 * setRdreceipt(Receipt rdreceipt) { this.rdreceipt = rdreceipt; }
	 */
	@Override
	public String toString() {
		return "RecurringDeposit [id=" + id + ", rdname=" + rdname + ", rdaccountexist=" + rdaccountexist
				+ ", rdaccountname=" + rdaccountname + ", rdaccountnumber=" + rdaccountnumber + ", rdaddress="
				+ rdaddress + ", rdnumber=" + rdnumber + ", rdamount=" + rdamount + ", time=" + time + ", rdintrest="
				+ rdintrest + ", rdnominee=" + rdnominee + /* ", rdreceipt=" + rdreceipt + */"]";
	}
	
	
}
