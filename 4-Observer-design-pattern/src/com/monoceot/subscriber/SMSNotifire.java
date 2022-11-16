package com.monoceot.subscriber;

import com.monocept.publisher.Account;

public class SMSNotifire implements INotifire {

	@Override
	public void notifyUser(Account account, double amount, String transactiontype) {
		System.out.println("Sms notification");
		
	}

	

}
