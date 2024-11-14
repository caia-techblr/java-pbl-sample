package org.gitam.cseblr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrepaidTest {

	@Test
	void test() {
		PrepaidCustomer pre = new PrepaidCustomer(/*....*/);
		pre.credit(100.0);
		pre.makeCall(125);
		assertEquals(pre.getBalance(), /*..*/ );
	}

}
