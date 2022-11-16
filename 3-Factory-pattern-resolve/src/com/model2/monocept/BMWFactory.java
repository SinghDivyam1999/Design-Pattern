package com.model2.monocept;

import com.model.monocept.BMW;
import com.model.monocept.IAutomobile;

public class BMWFactory implements IAutomobileFactory {

	private static BMWFactory obj;

	
	public static BMWFactory getInstance() {
		if (obj == null) {
			obj = new BMWFactory();
		}

		return obj;
	}

	@Override
	public IAutomobile makeAuto() {
		return (IAutomobile) new BMW();
	}

}
