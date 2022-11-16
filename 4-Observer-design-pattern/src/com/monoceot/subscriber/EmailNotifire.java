package com.monoceot.subscriber;

import com.monocept.publisher.Account;

public class EmailNotifire implements INotifire {


	@Override
	public void notifyUser(Account account, double amount, String transactionType) {
		System.out.println("Email Notification");
		
	}

}
