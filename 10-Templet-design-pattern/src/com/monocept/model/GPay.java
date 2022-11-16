package com.monocept.model;

public class GPay extends Upi {

	@Override
	void initialize() {
		System.out.println("Initializing payment through GPay");

	}

	@Override
	public void withdraw() {
		System.out.println("Withdrawing through GPay");

	}

	@Override
	public void deposit() {
		System.out.println("Depositing through GPay");

	}

}
