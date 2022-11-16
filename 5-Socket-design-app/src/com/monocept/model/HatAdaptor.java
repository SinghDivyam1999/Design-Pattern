package com.monocept.model;

import com.Adapter.model.Hat;

public class HatAdaptor implements IItems {
private static Hat hat;
public HatAdaptor(Hat hat){
	
}
	@Override
	public String getItemName() {
     return hat.getLongName();
	}

	@Override
	public double getItemPrice() {
		return hat.getBasicPrice()+hat.getgst();
		

	}

}
