package com.monocep.model;

public class SellStock implements IOrder {
	 private Stock abcStock;

	   public SellStock(Stock abcStock){
	      this.abcStock = abcStock;
	   }

	   public void execute() {
	      abcStock.sell();
	   }
	}
