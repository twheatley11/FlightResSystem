package com.flightressystem.model.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;

import java.lang.ClassCastException;


import com.flightressystem.model.domain.Customer;
import com.flightressystem.model.domain.CustomerLogin;
import com.flightressystem.model.domain.TravelReservation;
import com.flightressystem.model.exceptions.LoginNotFoundException;
import com.flightressystem.model.exceptions.ServiceLoadException;
import com.flightressystem.model.services.factory.ServicesFactory;
import junit.framework.TestCase;



/**
 * @author Tasha Wheatley
 * @since 3/28/20
 * 
 * 
 */

public class ICustomerLoginSvcTest extends TestCase{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");
	
	private ServicesFactory servicesFactory;
	private CustomerLogin login;
	private Customer customer; 
	private TravelReservation travelReservation = new TravelReservation();

	@Before
	public void setUp() throws Exception {
		super.setUp();
		servicesFactory = ServicesFactory.getInstance();
		
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
		}
	
	
	
	public final void testAuthenticateCustomerLogin() {
		// Here we are casting Factory output to ICustomerLoginService
		ICustomerLoginSvc custLoginSvc; 
		try {
			custLoginSvc = (ICustomerLoginSvc) servicesFactory.getService(ICustomerLoginSvc.NAME);
			assertTrue(custLoginSvc.authenticateCustomerLogin(travelReservation));
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

