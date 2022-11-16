package com.monocept.model;

public class LineItem {
	private int id;
	private int quantity;
	Product product;

	public LineItem(int id, int quantity, Product product) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.product = product;
	}
	public LineItem() {
		
	}

	public int getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}

	public double calculateLineItemCost() {
		return quantity * (product.getPrice());

	}

	@Override
	public String toString() {
		return "LineItem [id=" + id + ", quantity=" + quantity + ", product=" + product + ", getId()=" + getId()
				+ ", getQuantity()=" + getQuantity() + ", getProduct()=" + getProduct() + ", calculateLineItemCost()="
				+ calculateLineItemCost() + "]";
	}

}
