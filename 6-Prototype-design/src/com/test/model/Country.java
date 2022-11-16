package com.test.model;

import java.util.ArrayList;
import java.util.List;

public class Country implements Cloneable {
	private List<String> countryList;

	public Country(List<String> countryList) {
		super();
		this.countryList = countryList;
	}

	public Country() {
		this.countryList = new ArrayList<String>();
	}

	public List<String> getCountryList() {
		return countryList;
	}

	public void addData() {
		countryList.add("India");
		countryList.add("America");
		countryList.add("Japan");
		countryList.add("China");
		countryList.add("Russia");
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> tempList = new ArrayList<String>();
		for (String name : this.getCountryList()) {
			tempList.add(name);
		}
		return new Country(tempList);
	}
}
