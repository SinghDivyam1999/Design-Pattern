package com.monocept.model;

public class PhonePay extends Upi {

	@Override
	void initialize() {
		System.out.println("Initializing payment through PhonePay");

	}

	@Override
	public void withdraw() {
		System.out.println("Withdrawing through PhonePay");

	}

	@Override
	public void deposit() {
		System.out.println("Depositing through PhonePay");

	}

}
