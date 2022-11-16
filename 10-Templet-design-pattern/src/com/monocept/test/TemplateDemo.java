package com.monocept.test;

import com.monocept.model.GPay;
import com.monocept.model.Paytm;
import com.monocept.model.PhonePay;
import com.monocept.model.Upi;

public class TemplateDemo {

	public static void main(String[] args) {
		Upi upi = new PhonePay();
		upi.pay();
		System.out.println();

		upi = new Paytm();
		upi.pay();
		System.out.println();

		upi = new GPay();
		upi.pay();
	}

}
