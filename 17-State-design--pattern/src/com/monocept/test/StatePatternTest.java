package com.monocept.test;

import com.monocept.model.Context;
import com.monocept.model.startState;
import com.monocept.model.stopState;

public class StatePatternTest {

	public static void main(String[] args) {
		Context context = new Context();
		
		startState strtst = new startState();
		strtst.doAction(context);
		System.out.println(context.getState().toString());
		System.out.println("--------------------");
		
		stopState stpsts=new stopState();
		stpsts.doAction(context);
		System.out.println(context.getState().toString());
	}

}
