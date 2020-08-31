package com.flightressystem.model.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;


import org.junit.Test;

import com.flightressystem.model.domain.CreditCard;
import com.flightressystem.model.exceptions.InvalidCreditCardException;
import com.flightressystem.model.exceptions.ServiceLoadException;
import com.flightressystem.model.services.factory.ServicesFactory;

import junit.framework.TestCase;

/**
 * @author Tasha Wheatley
 * @since 3/28/20
 * 
 * 
 */

public class ICreditCardSvcTest extends TestCase{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");
	
	private ServicesFactory servicesFactory;
	private CreditCard creditCard; 
	private int id; 

	@Before
	public void setUp() throws Exception {
		super.setUp();
		servicesFactory = ServicesFactory.getInstance(); 
		
		creditCard = new CreditCard();
		creditCard = new CreditCard();
		creditCard.setCreditCardType("visa");
		creditCard.setCreditCardNum("1234567890123456");
		creditCard.setCreditCardExp("0722");
		
		id = 12345;
	}

	@Test
	public void testStoreCreditCard() {		
		ICreditCardSvc iccsvc; 
		try {
			iccsvc = (ICreditCardSvc) servicesFactory.getService(ICreditCardSvc.NAME);
			iccsvc.storeCreditCard(creditCard);			
			}
		catch (InvalidCreditCardException e1) {
			logger.warn("Invalid length of credit card number or expiration date");
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
	public void testGetCreditCard() {			
		ICreditCardSvc iccsvc; 
		try {
			iccsvc = (ICreditCardSvc) servicesFactory.getService(ICreditCardSvc.NAME);
			iccsvc.getCreditCard(id);			
			}
		catch (ServiceLoadException e1) {
			logger.error("ServiceLoadException");
			e1.printStackTrace();
			}
		catch (NullPointerException e2) {
			logger.error("NullPointerException when reading customer object");
			e2.printStackTrace();
			}
		catch (Exception e3) {
			logger.error("Unexpected Exception Found");
			e3.printStackTrace();
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
	}

}
