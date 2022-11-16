package com.monocept.model;

public class Buiscuit implements IItems {
private String name;
private double price;

	public Buiscuit(String name, double price) {
	super();
	this.name = name;
	this.price = price;
}

	@Override
	public String getItemName() {
		return name;

	}

	@Override
	public double getItemPrice() {
		return price;

	}

}
