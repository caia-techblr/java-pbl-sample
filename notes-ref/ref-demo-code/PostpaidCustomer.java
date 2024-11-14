package org.gitam.cseblr;

public class PostpaidCustomer extends Customer {

	final static double POSTPAID_TARIFF = 0.8;
	
	PostpaidCustomer(String id,String name, String phone, double balance)
	{
		 	super(id,name,phone,balance);
	}

	@Override
	public void credit(double amount) {   //billPay
		mBalance -= amount;

	}

	@Override
	public void makeCall(int nmins) {
		mBalance += nmins * POSTPAID_TARIFF;

	}

}
