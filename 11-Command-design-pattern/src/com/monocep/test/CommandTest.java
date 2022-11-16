package com.monocep.test;

import com.monocep.model.Broker;
import com.monocep.model.BuyStock;
import com.monocep.model.SellStock;
import com.monocep.model.Stock;

public class CommandTest {

	public static void main(String[] args) {
		Stock abcStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();

	}

}
