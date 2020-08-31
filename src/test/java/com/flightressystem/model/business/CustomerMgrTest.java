package com.flightressystem.model.business;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.flightressystem.model.domain.Customer;
import com.flightressystem.model.exceptions.InvalidCustomerException;
import com.flightressystem.model.exceptions.ServiceLoadException;
import junit.framework.TestCase;

public class CustomerMgrTest extends TestCase{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");
	
	private CustomerMgr custmgr;
	private Customer customer; 
	private String username; 
	
	@Before
	public void setUp() throws Exception {
		
		custmgr = new CustomerMgr();
		
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
	public void testCreateCustomerMgr() throws ServiceLoadException, InvalidCustomerException{
		try {
		assertTrue(Manager.class.isAssignableFrom(CustomerMgr.class));
		assertTrue(custmgr.create(customer));
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
	public void testGetCustomerMgr()throws ServiceLoadException, InvalidCustomerException{
		try {
		assertTrue(Manager.class.isAssignableFrom(CustomerMgr.class));
		custmgr.get(username);
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
	
	
	@Test
	public void testUpdateCustomerMgr() throws ServiceLoadException, InvalidCustomerException{
		try {
		assertTrue(Manager.class.isAssignableFrom(CustomerMgr.class));
		assertTrue(custmgr.update(customer));
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
	public void testDeleteCustomerMgr() throws ServiceLoadException, InvalidCustomerException{
		try {
			assertTrue(Manager.class.isAssignableFrom(CustomerMgr.class));
			assertTrue(custmgr.delete(customer));
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
	public void testGenerateStatementCustomerMgr() throws ServiceLoadException, InvalidCustomerException{	
		try {
			assertTrue(Manager.class.isAssignableFrom(CustomerMgr.class));
			assertTrue(custmgr.generateStatement(customer));
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
	
}
