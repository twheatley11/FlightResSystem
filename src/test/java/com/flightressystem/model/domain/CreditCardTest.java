package com.flightressystem.model.domain;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class CreditCardTest {
	CreditCard cc1, cc2, cc3, cc4;
	
	@Before
	public void setUp() throws Exception {
		cc1 = new CreditCard();
		cc1.setCreditCardType("visa");
		cc1.setCreditCardNum("1234567890123456");
		cc1.setCreditCardExp("0722");
		
		
		cc2 = new CreditCard();
		cc2.setCreditCardType("visa");
		cc2.setCreditCardNum("1234567890123456");
		cc2.setCreditCardExp("0722");
		
		cc3 = new CreditCard();
		cc3.setCreditCardType("visa");
		cc3.setCreditCardNum("1111111111111111");
		cc3.setCreditCardExp("0722");
		
		cc4 = new CreditCard();
		
	}

	// Test method that validates that all credit card input is valid
	@Test
	public final void testValidateCreditCard() {
		assertTrue ("cc1 validates", cc1.validate());
	}
			
	// Test method that does not validate because none of the parameters are passed
		@Test
		public final void testNotValidateCreditCard() {
			assertFalse ("cc4 validates", cc4.validate());
		}

	// Test method that checks if two credit card variables hold identical values
	@Test
	public final void testEqualsCreditCard() {
		assertTrue ("cc1 equals cc2", cc1.equals(cc2));
		}
			
	// Test method that checks if two credit card variables do not hold identical values
	@Test
	public final void testNotEqualsCreditCard() {
		assertFalse ("cc1 equals cc3", cc1.equals(cc3));
	}

}
