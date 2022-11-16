package com.monocept.model;

public class IntToBinaryExpression implements IExpression {
	private int num;

	public IntToBinaryExpression(int num) {
		this.num = num;
	}

	@Override
	public String interpret(Interpreter interpreter) {
		return interpreter.getBinaryFormat(this.num);
	}

}
