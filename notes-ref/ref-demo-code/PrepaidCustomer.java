package org.gitam.cseblr;

public class PrepaidCustomer extends Customer {

	final static double PREPAID_TARIFF = 1.0;
	
	PrepaidCustomer(String id,String name, String phone, double balance)
	{
		 	super(id,name,phone,balance);
	}

	@Override
	public void credit(double amount) {
		mBalance += amount;

	}

	@Override
	public void makeCall(int nmins) {
		mBalance -= nmins * PREPAID_TARIFF;

	}

}
