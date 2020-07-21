package com.amit.MicroServicesExample.model;


import java.io.Serializable;

public class AccountOpen implements Serializable {

	private int id;
	private String fname;
	private String mname;
	private String lname;
	private String number;
	private String address;
	private String city;
	private String state;
	private String country;
	private String fathname;
	private String mothname;
	private String aadhar;
	private double accountBalance;
	/* private Receipt receipt; */
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFathname() {
		return fathname;
	}
	public void setFathname(String fathname) {
		this.fathname = fathname;
	}
	public String getMothname() {
		return mothname;
	}
	public void setMothname(String mothname) {
		this.mothname = mothname;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}/*
		 * public Receipt getReceipt() { return receipt; } public void
		 * setReceipt(Receipt receipt) { this.receipt = receipt; }
		 */
	public AccountOpen(int id, String fname, String mname, String lname, String number, String address, String city,
			String state, String country, String fathname, String mothname, String aadhar, double accountBalance
			/*Receipt receipt*/){
		
		
		super();
		this.id = id;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.number = number;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.fathname = fathname;
		this.mothname = mothname;
		this.aadhar = aadhar;
		this.accountBalance = accountBalance;
		/* this.receipt = receipt; */
	}
	public AccountOpen() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AccountOpen [id=" + id + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", number="
				+ number + ", address=" + address + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", fathname=" + fathname + ", mothname=" + mothname + ", aadhar=" + aadhar + ", accountBalance="
				+ accountBalance + /* ", receipt=" + receipt + */"]";
	}
}
