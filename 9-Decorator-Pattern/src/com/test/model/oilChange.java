package com.test.model;

public class oilChange extends CarServiceDecorator {

	public oilChange(ICarService carObj) {
		super(carObj);
	}

	@Override
	public double getCost() {
		return 800 + super.getCost();
	}
}
