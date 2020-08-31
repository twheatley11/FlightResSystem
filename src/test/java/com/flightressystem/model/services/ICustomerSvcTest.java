package com.flightressystem.model.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.flightressystem.model.domain.Customer;
import com.flightressystem.model.exceptions.InvalidCustomerException;
import com.flightressystem.model.exceptions.ServiceLoadException;
import com.flightressystem.model.services.factory.ServicesFactory;

import junit.framework.TestCase;

/**
 * @author Tasha Wheatley
 * @since 3/28/20
 * 
 * 
 */

public class ICustomerSvcTest extends TestCase{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");
	
	private ServicesFactory servicesFactory;
	private Customer customer; 
	private String username; 
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		servicesFactory = ServicesFactory.getInstance();
		
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
		
		username = "twheatley";
	} 

	@Test
	public void testStoreCustomer() {		
		ICustomerSvc icustsvc; 
		try {
			icustsvc = (ICustomerSvc) servicesFactory.getService(ICustomerSvc.NAME);
			icustsvc.storeCustomer(customer);
			}
		catch (InvalidCustomerException e1) {
			logger.error("Invalid Account Exception");
			e1.printStackTrace();
		}
		catch (ServiceLoadException e2) {
			logger.error("ServiceLoadException");
			e2.printStackTrace();
			}
		catch (NullPointerException e3) {
			logger.error("NullPointerException when reading customer object");
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
	public void testGetCustomer() {	
		ICustomerSvc icustsvc; 
		try {
			Customer customer1 = new Customer();
			icustsvc = (ICustomerSvc) servicesFactory.getService(ICustomerSvc.NAME);
			
			customer1 = icustsvc.getCustomer(username);
			logger.debug("The retrieved customer username and password is: " + customer1.getUserName() + " " + customer1.getPassword());
			}
		catch (ServiceLoadException e1) {
			logger.error("ServiceLoadException");
			e1.printStackTrace();
			}
		catch (Exception e2) {
			logger.error("Unexpected Exception Found");
			e2.printStackTrace();
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
	}


}
