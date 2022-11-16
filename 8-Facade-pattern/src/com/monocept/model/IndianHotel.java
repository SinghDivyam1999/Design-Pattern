package com.monocept.model;

import com.monocept.model2.IMenu;
import com.monocept.model2.IndianMenu;

public class IndianHotel implements IHotel {

	@Override
	public IMenu getMenu() {
		
		return new IndianMenu();
	}

}
