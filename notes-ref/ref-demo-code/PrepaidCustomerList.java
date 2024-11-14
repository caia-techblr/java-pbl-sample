package org.gitam.cseblr;
import java.util.ArrayList;

public class PrepaidCustomerList {
	ArrayList<PrepaidCustomer> preCustomers;
	PrepaidCustomerList()
	{
		preCustomers = new ArrayList<PrepaidCustomer>();
	}
	void addPrepaidCustomer(String id,String name, String phone, double balance)
	{
		preCustomers.add(new PrepaidCustomer(id,name,phone,balance));
	}
	void displayAll()
	{
		for(ICustomer cref : preCustomers)
		{
			System.out.println(cref.getId() + "," + cref.getName() + "," + cref.getBalance() );
		}
	}
}
