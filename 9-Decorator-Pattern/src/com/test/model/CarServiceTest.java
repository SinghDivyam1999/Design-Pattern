package com.test.model;

public class CarServiceTest {

	public static void main(String[] args) {

		CarInspection car = new CarInspection();
		oilChange carObjOil = new oilChange(car);
		TyreAlign tyreObj = new TyreAlign(carObjOil);
		System.out.println(tyreObj.getCost());
	}

}
