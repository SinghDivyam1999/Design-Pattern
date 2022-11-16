package com.monocept.model;

public class startState implements IState {

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
	}

	public String toString() {
		return "Start State";
	}

}
