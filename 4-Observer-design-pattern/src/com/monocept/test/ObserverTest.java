package com.monocept.test;

import com.monoceot.subscriber.SMSNotifire;
import com.monocept.publisher.Account;

public class ObserverTest {

	public static void main(String[] args) {
Account ac=new Account(12345, "Aman", 5000);
ac.registerNotifire(new SMSNotifire());
ac.withdraw(5000);
	}

}
