package org.gitam.cseblr;
import org.gitam.cseblr.workshop.CustomerDb;

public class BillingDemo {
    public static void main(String args[])
    {
        CustomerDb db = new CustomerDb();
        db.addCustomer(/*..*/);
        db.removeCustomer(/*..*/);
        db.displayAll();
        db.findCustomerById(/*..*/);
        //Test code for other operations 
    }
}
  
