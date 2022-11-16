package com.monoceot.subscriber;

import com.monocept.publisher.Account;

public interface INotifire {
void notifyUser(Account account,double amount,String transactiontype);
}
