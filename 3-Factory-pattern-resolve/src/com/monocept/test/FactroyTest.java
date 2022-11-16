package com.monocept.test;

import com.model.monocept.IAutomobile;
import com.model2.monocept.AudiFactory;
import com.model2.monocept.BMWFactory;
import com.model2.monocept.IAutomobileFactory;
import com.model2.monocept.MarutiFactory;

public class FactroyTest {

	public static void main(String[] args) {
		IAutomobileFactory factory = new BMWFactory();
		IAutomobileFactory factory1 = new MarutiFactory();
		IAutomobileFactory factory2 = new AudiFactory();

		IAutomobile bmw = factory.makeAuto();
		bmw.start();
		bmw.stop();

		IAutomobile maruti = factory1.makeAuto();
		maruti.start();
		maruti.stop();

		IAutomobile audi = factory2.makeAuto();
		audi.start();
		audi.stop();

	}

}
