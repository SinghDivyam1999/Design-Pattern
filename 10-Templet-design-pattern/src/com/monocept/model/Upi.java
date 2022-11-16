package com.monocept.model;

public abstract class Upi {

	abstract void initialize();

	abstract public void withdraw();

	abstract public void deposit();

	public final void pay() {
		initialize();
		withdraw();
		deposit();
	}
}
