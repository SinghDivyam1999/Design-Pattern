package com.monocept.test;

import java.util.ArrayList;
import java.util.List;

import com.monocept.model.Customer;
import com.monocept.model.LineItem;
import com.monocept.model.Order;
import com.monocept.model.Product;

public class OrderTest {
	public static void main(String[] args) {
		Product pr = new Product(101, "Biscuit", 500, 5.5f);
		Product pr2 = new Product(102, "Toothpaste", 600, 4.4f);
		Product pr3 = new Product(103, "Fruits", 400, 7.4f);
		Product pr4 = new Product(104, "Milk", 100, 2.4f);
		
		LineItem li = new LineItem(11, 10, pr);
		LineItem li2 = new LineItem(12, 20, pr2);
		LineItem li3=new LineItem(13,4,pr3);
		LineItem li4=new LineItem(14, 8, pr3);
		
		List<LineItem> lineItemList1 = new ArrayList<>();
		lineItemList1.add(li);
		lineItemList1.add(li2);
		
		List<LineItem> lineItemList2 = new ArrayList<>();
		lineItemList2.add(li3);
		lineItemList2.add(li4);
		
		Order o1=new Order(1, "30/07/2022",lineItemList1);
		Order o2=new Order(2,"20/08/2022", lineItemList2);
		
		ArrayList<Order> orderList=new ArrayList<Order>();
		orderList.add(o1);
		orderList.add(o2);
		
Customer c1=new Customer(1,"Akhil", orderList);
System.out.println("Orders Detail is: "+c1);
	}

}
