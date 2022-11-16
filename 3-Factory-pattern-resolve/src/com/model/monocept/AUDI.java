package com.model.monocept;

public class AUDI implements IAutomobile {

	@Override
	public void start() {
		System.out.println("Audi starts");

	}

	@Override
	public void stop() {
		System.out.println("Audi stops");
	}

}
