package com.flightressystem.model.domain;

import static org.junit.Assert.*;




import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

	private Customer customer1, customer2, customer3, customer4;
		
				
	@Before	
	public void setUp() throws Exception {

		
		customer1 = new Customer();
		customer1.setLastName("Wheatley");
		customer1.setFirstName("Tasha");
		customer1.setUserName("twheatley");
		customer1.setPassword("12345");
		customer1.setEmailAddress("twheatley@regis.edu");
		customer1.setAddress("1234 Main Street");
		customer1.setCity("Denver");
		customer1.setState("Colorado");
		customer1.setZipCode(12345);
		customer1.setCustID(11111);
		
		customer2 = new Customer();		
		customer2.setLastName("Wheatley");
		customer2.setFirstName("Tasha");
		customer2.setUserName("twheatley");
		customer2.setPassword("12345");
		customer2.setEmailAddress("twheatley@regis.edu");
		customer2.setAddress("1234 Main Street");
		customer2.setCity("Denver");
		customer2.setState("Colorado");
		customer2.setZipCode(12345);
		customer2.setCustID(11111);
		
		customer3 = new Customer();
		customer3.setLastName("Gorney");
		customer3.setFirstName("Tanisha");
		customer3.setUserName("twheatley");
		customer3.setPassword("12345");
		customer3.setEmailAddress("twheatley@regis.edu");
		customer3.setAddress("1234 Main Street");
		customer3.setCity("Denver");
		customer3.setState("Colorado");
		customer3.setZipCode(12345);
		customer3.setCustID(11111);
		
		customer4 = new Customer();
		
	}

	
	// Test method that validates that all customer input is valid
	@Test
	public final void testValidateCustomer() {
		assertTrue ("customer validates", customer1.validate());
	}
	
	// Test method that does not validate because none of the parameters are passed
		@Test
		public final void testNotValidateCustomer() {
			assertFalse ("customer validates", customer4.validate());
		}

	// Test method that checks if two customer variables hold identical values
	@Test
	public final void testEqualsCustomer() {
		assertTrue ("customer1 equals customer2", customer1.equals(customer2));
		}
	
	// Test method that checks if two customer variables do not hold identical values
		@Test
		public final void testNotEqualsCustomer() {
			assertFalse ("customer1 equals customer3", customer1.equals(customer3));
			}
	}


	


