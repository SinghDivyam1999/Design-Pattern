package com.monocept.test;

import com.monocept.model.AutomobileFactory;
import com.monocept.model.Autotype;
import com.monocept.model.IAutomobile;

public class AutomobileFactoryTest {

	public static void main(String[] args) {
		AutomobileFactory factory = new AutomobileFactory();
		IAutomobile bmw = factory.makeAuto(Autotype.BMW);
		bmw.start();
		bmw.stop();
	}

}
