package com.test.model;

public class TyreAlign extends CarServiceDecorator {

	public TyreAlign(ICarService carObj) {
		super(carObj);
	}

	@Override
	public double getCost() {
		return 300 + super.getCost();
	}
}
