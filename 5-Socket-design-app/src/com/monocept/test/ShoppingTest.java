package com.monocept.test;

import com.Adapter.model.Hat;
import com.monocept.model.Buiscuit;
import com.monocept.model.HatAdaptor;
import com.monocept.model.ShoppingCart;

public class ShoppingTest {

	public static void main(String[] args) {
ShoppingCart cart=new ShoppingCart();
cart.addItemstoCart(new Buiscuit("ParleG",10));
cart.addItemstoCart(new HatAdaptor(new Hat("Red Hat","Red Hat with logo",500,450)));
System.out.println(cart.getCartItems());
	}

}
