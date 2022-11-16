package com.test.model;

public class TuneCar extends CarServiceDecorator {

	public TuneCar(ICarService carObj) {
		super(carObj);
	}

	@Override
	public double getCost() {
		return 400 + super.getCost();
	}

}
