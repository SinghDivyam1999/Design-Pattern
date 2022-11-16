package com.monocept.publisher;

import java.util.List;

import com.monoceot.subscriber.INotifire;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;
	private List<INotifire> notification;

	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<INotifire> getNotification() {
		return notification;
	}

	public void setNotification(List<INotifire> notification) {
		this.notification = notification;
	}

	public void withdraw(double amount) {
		if (amount < balance) {
			balance = balance - amount;
			for (INotifire x : notification) {
				x.notifyUser(this,balance,"Withdraw");
			}
		} else {
			System.out.println("Insufficient balance");
		}
	}
public void registerNotifire(INotifire notifire)
	 {
notification.add(notifire);
	}

}
