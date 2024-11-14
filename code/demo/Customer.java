package org.gitam.cseblr;

public class Customer implements ICustomer {

	String mId;
	String mName;
	String mPhone;
	double mBalance;
	
	Customer(String id,String name, String phone, double balance)
	{
		mId = id;
		mName = name;
		mPhone = phone;
		mBalance = balance;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return mBalance;
	}
	
	public String getId() 
	{
		return mId;
	}
	public String getName()
	{
		return mName;
	}
	public String getPhone()
	{
		return mPhone;
	}

}
