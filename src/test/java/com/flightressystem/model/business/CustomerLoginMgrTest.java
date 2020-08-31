package com.flightressystem.model.business;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.flightressystem.model.domain.Customer;
import com.flightressystem.model.domain.CustomerLogin;
import com.flightressystem.model.domain.TravelReservation;
import com.flightressystem.model.exceptions.LoginNotFoundException;
import com.flightressystem.model.exceptions.ServiceLoadException;
import com.flightressystem.model.services.factory.ServicesFactory;

import junit.framework.TestCase;

public class CustomerLoginMgrTest extends TestCase{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");
	
	private CustomerLoginMgr custLoginMgr;
	private Customer customer; 
	private CustomerLogin login; 
	private TravelReservation travelReservation = new TravelReservation();

	@Before
	public void setUp() throws Exception {
		super.setUp();
		ServicesFactory.getInstance();
		
		login = new CustomerLogin();
		login.setUsername("twheatley");
		login.setPassword("12345");
		
		customer = new Customer();
		customer.setLastName("Wheatley");
		customer.setFirstName("Tasha");
		customer.setUserName("twheatley");
		customer.setPassword("12345");
		customer.setEmailAddress("twheatley@regis.edu");
		customer.setAddress("1234 Main Street");
		customer.setCity("Denver");
		customer.setState("Colorado");
		customer.setZipCode(12345);
		customer.setCustID(11111);
		
		
		travelReservation.setCustomer(customer);
		
		custLoginMgr = new CustomerLoginMgr();
		}

	
	
	@Test
	public void testCreateCustomerLoginMgr() throws ServiceLoadException, LoginNotFoundException{
		try {
		assertTrue(Manager.class.isAssignableFrom(CustomerMgr.class));
		assertTrue(custLoginMgr.create(login));
		}
		catch (ServiceLoadException e1) {
			logger.error("ServiceLoadException");
			e1.printStackTrace();
			}
		catch (LoginNotFoundException e2) {
			logger.error("LoginNotFoundException");
			e2.printStackTrace();
			}
		catch (ClassCastException e3) {
			logger.error("ClassCastException");
			e3.printStackTrace();
			}
		catch (Exception e4) {
			logger.error("Unexpected Exception Found");
			e4.printStackTrace();
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		}
	
	@Test 
	public void testUpdateCustomerLoginMgr() throws ServiceLoadException, LoginNotFoundException{
		try {
		assertTrue(Manager.class.isAssignableFrom(CustomerMgr.class));
		assertTrue(custLoginMgr.update(login));
		}
		catch (ServiceLoadException e1) {
			logger.error("ServiceLoadException");
			e1.printStackTrace();
			}
		catch (LoginNotFoundException e2) {
			logger.error("LoginNotFoundException");
			e2.printStackTrace();
			}
		catch (ClassCastException e3) {
			logger.error("ClassCastException");
			e3.printStackTrace();
			}
		catch (Exception e4) {
			logger.error("Unexpected Exception Found");
			e4.printStackTrace();
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		}
	
	@Test
	public void testDeleteCustomerLoginMgr() throws ServiceLoadException, LoginNotFoundException{
		try {
		assertTrue(Manager.class.isAssignableFrom(CustomerMgr.class));
		assertTrue(custLoginMgr.delete(login));
		}
		catch (ServiceLoadException e1) {
			logger.error("ServiceLoadException");
			e1.printStackTrace();
			}
		catch (LoginNotFoundException e2) {
			logger.error("LoginNotFoundException");
			e2.printStackTrace();
			}
		catch (ClassCastException e3) {
			logger.error("ClassCastException");
			e3.printStackTrace();
			}
		catch (Exception e4) {
			logger.error("Unexpected Exception Found");
			e4.printStackTrace();
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		}

	
	
}
