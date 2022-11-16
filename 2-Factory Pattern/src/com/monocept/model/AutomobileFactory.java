package com.monocept.model;

public class AutomobileFactory {
	public IAutomobile makeAuto(Autotype auto) {
		if (auto == Autotype.BMW) {
			return new BMW();
		} else if (auto == Autotype.AUDI) {
			return new AUDI();
		} else {
			return new MARUTI();
		}
	}
}