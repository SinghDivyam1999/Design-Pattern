package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int id;
	private String name;
	List<Order> orders = new ArrayList<>();

	public Customer(int id, String name, List<Order> orders) {
		super();
		this.id = id;
		this.name = name;
		this.orders = orders;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	public int getOrderCount() {
		return orders.size();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", orders=" + orders + "]";
	}

	
	
}
