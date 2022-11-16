package com.model2.monocept;

import com.model.monocept.AUDI;
import com.model.monocept.IAutomobile;

public class AudiFactory implements IAutomobileFactory {
	private static AudiFactory obj;
	
	public static AudiFactory getInstance() {
		if (obj == null) {
			obj = new AudiFactory();
		}

		return obj;
	}
	@Override
	public IAutomobile makeAuto() {
		
		return (IAutomobile)new AUDI();
	}
	
}
