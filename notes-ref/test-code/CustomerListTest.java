package org.gitam.cseblr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerListTest {

	PrepaidCustomerList preCustomers;
	
	@BeforeEach
	void SetUp() {
		preCustomers = new PrepaidCustomers(/*...*/);
		preCustomers.addPrepaidCustomer(/*..*/);
		preCustomers.addPrepaidCustomer(/*..*/);
		preCustomers.addPrepaidCustomer(/*..*/);
		preCustomers.addPrepaidCustomer(/*..*/);
	}

	@Test
	void testIsFoundTrue() {
		boolean res = preCustomers.isCustomerFound(105);
	    assertTrue(res);			
	}
	@Test
	void testIsFoundFalse() {
		boolean res = preCustomers.isCustomerFound(109);
		assertFalse(res);
		
		
	}

}
