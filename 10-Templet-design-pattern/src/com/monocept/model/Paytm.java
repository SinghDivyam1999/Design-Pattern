package com.monocept.model;

public class Paytm extends Upi {

	@Override
	void initialize() {
		System.out.println("Initializing payment through Paytm");

	}

	@Override
	public void withdraw() {
		System.out.println("Withdrawing through Paytm");

	}

	@Override
	public void deposit() {
		System.out.println("Depositing through Paytm");

	}

}
