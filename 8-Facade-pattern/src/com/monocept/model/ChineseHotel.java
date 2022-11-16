package com.monocept.model;

import com.monocept.model2.ChineaseMenu;
import com.monocept.model2.IMenu;

public class ChineseHotel implements IHotel {
	@Override
	public IMenu getMenu() {
		
		return new ChineaseMenu();
	}
}
