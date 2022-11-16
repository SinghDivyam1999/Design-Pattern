package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	LineItem li=new LineItem();
	Product pr=new Product();
	private int id;
	private String date;
	List<LineItem> items = new ArrayList<>();

	public Order(int id, String date, List<LineItem> items) {
		super();
		this.id = id;
		this.date = date;
		this.items = items;
	}

	public int getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public void addLineItem(LineItem item) {
		items.add(item);
	}

	public int itemCount() {
		return items.size();
	}

	public double calculateOrderPrice() { // ?
		return li.getQuantity()*pr.calculatePriceAfterDiscount();
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", items=" + items + ", getId()=" + getId() + ", getDate()="
				+ getDate() + ", getItems()=" + getItems() + ", itemCount()=" + itemCount() + ", calculateOrderPrice()="
				+ calculateOrderPrice() + "]";
	}

}
