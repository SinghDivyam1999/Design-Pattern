package com.model.monocept;

public class BMW implements IAutomobile {

	@Override
	public void start() {
		System.out.println("BMW starts");

	}

	@Override
	public void stop() {
		System.out.println("BMW stops");
	}

}
