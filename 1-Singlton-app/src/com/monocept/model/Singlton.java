package com.monocept.model;

import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singlton implements Serializable {

//	private static Singlton obj = new Singlton();   //eagar Initialization
	private static Singlton obj;

	private Singlton() {

	}

	public static synchronized Singlton GetInstance() throws IOException {  //lazy initialization
		if (obj == null) {
			obj = new Singlton();
		}
		return obj;

	}
	private Object readResolve() throws ObjectStreamException{
		return obj;
	}
}

