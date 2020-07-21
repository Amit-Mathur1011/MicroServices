package com.amit.MicroServicesExample.model;

public class Withdraw {
	private int id;
	private String withdrawname;
	private long withdrawaccountnumber;
	private String withdrawamount;
	/*
	 * @OneToOne(mappedBy = "withdraws",cascade = CascadeType.ALL) private Receipt
	 * receipt;
	 */
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWithdrawname() {
		return withdrawname;
	}
	public void setWithdrawname(String withdrawname) {
		this.withdrawname = withdrawname;
	}
	public long getWithdrawaccountnumber() {
		return withdrawaccountnumber;
	}
	public void setWithdrawaccountnumber(long withdrawaccountnumber) {
		this.withdrawaccountnumber = withdrawaccountnumber;
	}
	public String getWithdrawamount() {
		return withdrawamount;
	}
	public void setWithdrawamount(String withdrawamount) {
		this.withdrawamount = withdrawamount;
	}
	@Override
	public String toString() {
		return "Withdraw [id=" + id + ", withdrawname=" + withdrawname + ", withdrawaccountnumber="
				+ withdrawaccountnumber + ", withdrawamount=" + withdrawamount + "]";
	}
}
