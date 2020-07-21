package com.amit.MicroServicesExample.model;

public class FixedDeposit {

	private int id;
	private String fdname;
	private boolean accountexist;
	private String accountname;
	private long accountnumber;
	private String fdaddress;
	private long fdnumber;
	private double fdamount;
	private String time;
	private double fdintrest;
	private String fdnominee;
	//private Receipt fdreceipt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFdname() {
		return fdname;
	}
	public void setFdname(String fdname) {
		this.fdname = fdname;
	}
	public boolean isAccountexist() {
		return accountexist;
	}
	public void setAccountexist(boolean accountexist) {
		this.accountexist = accountexist;
	}
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getFdaddress() {
		return fdaddress;
	}
	public void setFdaddress(String fdaddress) {
		this.fdaddress = fdaddress;
	}
	public long getFdnumber() {
		return fdnumber;
	}
	public void setFdnumber(long fdnumber) {
		this.fdnumber = fdnumber;
	}
	public double getFdamount() {
		return fdamount;
	}
	public void setFdamount(double fdamount) {
		this.fdamount = fdamount;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getFdintrest() {
		return fdintrest;
	}
	public void setFdintrest(double fdintrest) {
		this.fdintrest = fdintrest;
	}
	public String getFdnominee() {
		return fdnominee;
	}
	public void setFdnominee(String fdnominee) {
		this.fdnominee = fdnominee;
	}

	/*
	 * public Receipt getFdreceipt() { return fdreceipt; } public void
	 * setFdreceipt(Receipt fdreceipt) { this.fdreceipt = fdreceipt; }
	 */
	@Override
	public String toString() {
		return "FixedDeposit [id=" + id + ", fdname=" + fdname + ", accountexist=" + accountexist + ", accountname="
				+ accountname + ", accountnumber=" + accountnumber + ", fdaddress=" + fdaddress + ", fdnumber="
				+ fdnumber + ", fdamount=" + fdamount + ", time=" + time + ", fdintrest=" + fdintrest + ", fdnominee="
				+ fdnominee + /* ", fdreceipt=" + fdreceipt + */ "]";
	}
	
	
}
