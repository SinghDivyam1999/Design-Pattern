package com.model2.monocept;

import com.model.monocept.IAutomobile;
import com.model.monocept.MARUTI;

public class MarutiFactory implements IAutomobileFactory {

	private static MarutiFactory obj;
	
	public static MarutiFactory getInstance() {
		if (obj == null) {
			obj = new MarutiFactory();
		}

		return obj;
	}

	@Override
	public IAutomobile makeAuto() {
		return (IAutomobile) new MARUTI();
	}
}
