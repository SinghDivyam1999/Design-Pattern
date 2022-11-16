package com.monocept.model;

import com.monocept.model2.IMenu;
import com.monocept.model2.italianMenu;

public class ItalianHotel implements IHotel {
	@Override
	public IMenu getMenu() {
		
		return new italianMenu();
	}
}
