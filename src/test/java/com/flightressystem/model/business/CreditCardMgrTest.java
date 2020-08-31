package com.flightressystem.model.business;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.flightressystem.model.domain.CreditCard;
import com.flightressystem.model.exceptions.InvalidCreditCardException;
import com.flightressystem.model.exceptions.InvalidCustomerException;
import com.flightressystem.model.exceptions.ServiceLoadException;
import com.flightressystem.model.services.factory.ServicesFactory;

import junit.framework.TestCase;

public class CreditCardMgrTest extends TestCase{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");
	
	private CreditCardMgr ccmgr;
	private CreditCard creditCard; 
	private int id; 

	@Before
	public void setUp() throws Exception {
		super.setUp();
		ServicesFactory.getInstance(); 
		
		creditCard = new CreditCard();
		creditCard.setCreditCardType("visa");
		creditCard.setCreditCardNum("1234567890123456");
		creditCard.setCreditCardExp("0722");
		
		id = 12345;
		
		ccmgr = new CreditCardMgr();
	}

	@Test
	public void testCreateCustomerMgr() throws ServiceLoadException, InvalidCustomerException{
		try {
		assertTrue(Manager.class.isAssignableFrom(CustomerMgr.class));
		assertTrue(ccmgr.create(creditCard));
		}
	catch (InvalidCreditCardException e1) {
		logger.error("CreditCardException");
		e1.printStackTrace();
		}
	catch (ServiceLoadException e2) {
		logger.error("ServiceLoadException");
		e2.printStackTrace();
		}
	catch (NullPointerException e3) {
		logger.error("NullPointerException when creating credit card object");
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
	public void testGetCustomerMgr() throws ServiceLoadException, InvalidCustomerException{
		try {
		assertTrue(Manager.class.isAssignableFrom(CustomerMgr.class));
		ccmgr.get(id);
		}
	catch (InvalidCreditCardException e1) {
		logger.error("CreditCardException");
		e1.printStackTrace();
		}
	catch (ServiceLoadException e2) {
		logger.error("ServiceLoadException");
		e2.printStackTrace();
		}
	catch (NullPointerException e3) {
		logger.error("NullPointerException when getting credit card object");
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
	public void testUpdateCustomerMgr() throws ServiceLoadException, InvalidCustomerException{
		try {
		assertTrue(Manager.class.isAssignableFrom(CustomerMgr.class));
		assertTrue(ccmgr.update(creditCard));
		}
	catch (InvalidCreditCardException e1) {
		logger.error("CreditCardException");
		e1.printStackTrace();
		}
	catch (ServiceLoadException e2) {
		logger.error("ServiceLoadException");
		e2.printStackTrace();
		}
	catch (NullPointerException e3) {
		logger.error("NullPointerException when updating credit card object");
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
		assertTrue(ccmgr.delete(creditCard));
		}
	catch (InvalidCreditCardException e1) {
		logger.error("CreditCardException");
		e1.printStackTrace();
		}
	catch (ServiceLoadException e2) {
		logger.error("ServiceLoadException");
		e2.printStackTrace();
		}
	catch (NullPointerException e3) {
		logger.error("NullPointerException when deleting credit card object");
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
