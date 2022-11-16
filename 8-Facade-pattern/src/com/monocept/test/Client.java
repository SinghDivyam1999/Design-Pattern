package com.monocept.test;

import com.monocept.model.HotelReception;

public class Client extends HotelReception {

	public static void main(String[] args) {
		HotelReception reception=new HotelReception();
		reception.getChineseMenu();
		reception.getIndianMenu();
		reception.getItalianMenu();

	}

}
