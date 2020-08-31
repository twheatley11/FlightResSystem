package com.flightressystem.model.domain;

import static org.junit.Assert.*;



import org.junit.Before;
import org.junit.Test;

public class CustomerLoginTest {

	CustomerLogin login1, login2, login3, login4; 
	
	@Before
	public void setUp() throws Exception {
		login1 = new CustomerLogin();
		login1.setUsername("twheatley");
		login1.setPassword("12345");
		
		login2 = new CustomerLogin();
		login2.setUsername("twheatley");
		login2.setPassword("12345");
		
		login3 = new CustomerLogin();
		login3.setUsername("twheatley");
		login3.setPassword("1111");
		
		login4 = new CustomerLogin();
	}

	// Test method that validates that all login input is valid
	@Test
	public void testValidateCustomerLogin() {
		assertTrue ("customer login validates", login1.validate());
	}
	
	// Test method that does not validate because none of the parameters are passed
	@Test
	public void testNotValidateCustomerLogin() {
		assertFalse ("customer login does not validates", login4.validate());
	}

	// Test method that checks that the login information is accurate 
	@Test
	public void testLoggedIn() {
		assertTrue ("customer login accepted", login1.loggedIn("twheatley", "12345"));
	}
	
	// Test method that checks that the password is inaccurate 
	@Test
	public void testNotLoggedInPassword() {
		assertFalse ("customer login not accepted", login1.loggedIn("twheatley", "1111"));
	}

	// Test method that checks that the password is inaccurate 
	@Test
	public void testNotLoggedInUsername() {
		assertFalse ("customer login not accepted", login1.loggedIn("twheatley2", "12345"));
	}
	
	// Test method that checks if the two login variables hold identical values
	@Test
	public void testEqualsCustomerLogin() {
		assertTrue ("login1 equals login2", login1.equals(login2));
	}
	
	// Test method that checks if the two login variables do not hold identical values
	@Test
	public void testNotEqualsCustomerLogin() {
		assertFalse ("login1 equals login3", login1.equals(login3));
	}

	

}
