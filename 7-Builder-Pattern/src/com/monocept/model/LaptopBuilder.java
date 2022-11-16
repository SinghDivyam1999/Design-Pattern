package com.monocept.model;

public class LaptopBuilder {
//private Laptop laptop;

 Laptop laptop=new Laptop();
public LaptopBuilder() {
	super();
	this.laptop = laptop;
}
public LaptopBuilder addRam(String ram) {
	laptop.setRam(ram);
	return this;
}
public LaptopBuilder addhdd(String hdd) {
	laptop.setRam(hdd);
	return this;

}

public LaptopBuilder addKeyboard(String keyboard) {
	laptop.setKeyboard(keyboard);
	return this;
}
public LaptopBuilder istouchSceen(Boolean touchScreen) {
	laptop.setTouchScreen(touchScreen);
	return this;
}
	public Laptop getLaptop(){
		return laptop;
	}
}


