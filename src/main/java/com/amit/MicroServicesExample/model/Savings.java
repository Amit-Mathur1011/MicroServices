package com.amit.MicroServicesExample.model;

public class Savings {

	private int id;
	private String savingname;
	private long savingaccountnumber;
	private String savingdeposit;
	private int savingnumber;
	//private Receipt savingreceipt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSavingname() {
		return savingname;
	}
	public void setSavingname(String savingname) {
		this.savingname = savingname;
	}
	public long getSavingaccountnumber() {
		return savingaccountnumber;
	}
	public void setSavingaccountnumber(long savingaccountnumber) {
		this.savingaccountnumber = savingaccountnumber;
	}
	public String getSavingdeposit() {
		return savingdeposit;
	}
	public void setSavingdeposit(String savingdeposit) {
		this.savingdeposit = savingdeposit;
	}
	public int getSavingnumber() {
		return savingnumber;
	}
	public void setSavingnumber(int savingnumber) {
		this.savingnumber = savingnumber;
	}

	/*
	 * public Receipt getSavingreceipt() { return savingreceipt; } public void
	 * setSavingreceipt(Receipt savingreceipt) { this.savingreceipt = savingreceipt;
	 * }
	 */	@Override
	public String toString() {
		return "Savings [id=" + id + ", savingname=" + savingname + ", savingaccountnumber=" + savingaccountnumber
				+ ", savingdeposit=" + savingdeposit + ", savingnumber=" + savingnumber
				+ /*
					 * ", savingreceipt=" + savingreceipt +
					 */"]";
	}

	}
