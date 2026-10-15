package com.Streams;

public class Account {
	
	private int accid;
	private String accountname;
	private double balance;
	
	
	public Account(int accid, String accountname, double balance) {
		super();
		this.accid = accid;
		this.accountname = accountname;
		this.balance = balance;
	}


	public int getAccid() {
		return accid;
	}


	public void setAccid(int accid) {
		this.accid = accid;
	}


	public String getAccountname() {
		return accountname;
	}


	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [accid=" + accid + ", accountname=" + accountname + ", balance=" + balance + "]";
	}
	

}
