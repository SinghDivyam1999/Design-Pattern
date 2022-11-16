package com.monocept.model;

public class IntToOctalExpression implements IExpression {
	private int num;

	public IntToOctalExpression(int num) {
		super();
		this.num = num;
	}

	@Override
	public String interpret(Interpreter interpreter) {
		return interpreter.getOctalFormate(this.num);
	}

}
