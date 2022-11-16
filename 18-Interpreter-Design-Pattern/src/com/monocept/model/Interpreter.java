package com.monocept.model;

public class Interpreter {
	public String getBinaryFormat(int i) {
		return Integer.toBinaryString(i);
	}

	public String getOctalFormate(int i) {
		return Integer.toOctalString(i);
	}
}
