package com.monocept.model;

import com.monocept.model2.IMenu;

public class HotelReception {
	public void getIndianMenu() {
		IHotel indHotel = new IndianHotel();
		IMenu indMenu = indHotel.getMenu();
		indMenu.displayMenu();

	}

	public void getChineseMenu() {
		System.out.println("Indian Menu");
	}

	public void getItalianMenu() {
		System.out.println("Indian Menu");
	}
}
