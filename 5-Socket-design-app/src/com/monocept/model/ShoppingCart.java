package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
List <IItems> cartItem= new ArrayList<>();
public void addItemstoCart(IItems item) {
	
}
public List <IItems> getCartItems(){
	for(IItems i:cartItem) {
		cartItem.add(i);
	}
	return cartItem;
	
}
public void getTotalCartPrice() {
	
}
}
