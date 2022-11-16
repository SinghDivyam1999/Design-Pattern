package com.monocept.test;

import com.monocept.model.Laptop;
import com.monocept.model.LaptopBuilder;

public class LaptopTest {

	public static void main(String[] args) {
Laptop laptop=new LaptopBuilder().addhdd("hdd3").addKeyboard("DELL").addRam("CDD").getLaptop();
System.out.println(laptop);
	}

}
