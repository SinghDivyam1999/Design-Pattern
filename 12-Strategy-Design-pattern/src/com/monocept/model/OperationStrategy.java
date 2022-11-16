package com.monocept.model;

public class OperationStrategy implements IOperation{
IOperation operation;

public OperationStrategy(IOperation operation) {
	super();
	this.operation = operation;
}
public int doOperation(int a,int b) {
	return operation.doOperation(a, b);
}
public void setOperation(IOperation operation) {
	this.operation = operation;
}



}
