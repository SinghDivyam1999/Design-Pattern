package com.monocept.test;

import com.monocept.model.AddOperation;
import com.monocept.model.MultiplyOperation;
import com.monocept.model.OperationStrategy;

public class StrategyTest {

	public static void main(String[] args) {
		OperationStrategy op = new OperationStrategy(new AddOperation());
		System.out.println(op.doOperation(30, 20));
		op.setOperation(new MultiplyOperation());
		System.out.println(op.doOperation(30, 20));
	}

}
