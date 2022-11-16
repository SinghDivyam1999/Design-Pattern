package com.monocept.test;

import java.util.List;

import com.test.model.Country;

public class CountryCloneObject {

	public static void main(String[] args) throws CloneNotSupportedException {
		Country country = new Country();
		country.addData();
		Country cntry = (Country) country.clone();
		List<String> list = cntry.getCountryList();
		list.add("Srilanka");
		System.out.println(country.getCountryList());
		System.out.println(list);
		list.remove("Japan");
		System.out.println(list);
		System.out.println("Original list: "+country.getCountryList());
	}

}
