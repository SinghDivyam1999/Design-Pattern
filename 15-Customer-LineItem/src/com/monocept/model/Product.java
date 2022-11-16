package com.monocept.model;

public class Product {
	private int id;
	private String name;
	private double price;
	private float discount;

	public Product(int id, String name, double price, float discount) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
public Product() {
	
}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public float getDiscount() {
		return discount;
	}

	public double calculatePriceAfterDiscount() {
		return price - (price * discount);

	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", discount=" + discount + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getPrice()=" + getPrice() + ", getDiscount()="
				+ getDiscount() + ", Calculated Discount" + calculatePriceAfterDiscount() + "]";
	}

}
