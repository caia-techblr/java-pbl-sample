package org.gitam.cseblr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/*
class CustomerNotFoundException extends Exception
{
	String eid;
	public CustomerNotFoundException(String id) {
		eid = id;
	}
	public String toString() {
		return "Customer not found with ID " + eid;
	}
	
}
//...
catch(CustomerNotFoundException cne) {
  System.out.println(""+cne);
*/

class CustomerNameComparator implements Comparator<PrepaidCustomer>
{

	@Override
	public int compare(PrepaidCustomer o1, PrepaidCustomer o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

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
		/*for(ICustomer cref : preCustomers)
		{
			System.out.println(cref.getId() + "," + cref.getName() + "," + cref.getBalance() );
		}*/
		preCustomers.forEach(  (cref) -> { 
			System.out.println(cref.getId() + ","  + cref.getBalance()); 
		} ); 
	}
	boolean isCustomerFound(String key)
	{
		for(ICustomer cref : preCustomers)
		{
			if(cref.getId() == key)
				return true;
		}
		return false;
		
		/*
		Iterator<ICustomer> iter = preCustomers.iterator();
		while(iter.hasNext())
		{
			ICustomer ref = iter.next();
			if(ref.getId()==key)
				return true;			
		}
		return false; 
		*/
	}
	public ICustomer findCustomerById(String key) //throws CustomerNotFoundException 
	{
		for(ICustomer cref : preCustomers)
		{
			if(cref.getId() == key)
				return cref;
		}
		return null;  //throw new CustomerNotFoundException(key);
	}
	public void SortCustomersByName()
	{
		//Collections.sort(preCustomers, new CustomerNameComparator());
		Collections.sort(preCustomers, new Comparator<PrepaidCustomer>() {

			@Override
			public int compare(PrepaidCustomer o1, PrepaidCustomer o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		}
	  );
	}
}
