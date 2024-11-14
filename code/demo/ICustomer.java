package org.gitam.cseblr;

public interface ICustomer {
	void credit(double amount);		//recharge / billpay
	void makeCall(int nmins);		//durations
	double getBalance();
	
	String getId();
	String getName();
	String getPhone();
}
