package com.flightressystem.model.business;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.flightressystem.model.domain.CreditCard;
import com.flightressystem.model.exceptions.InvalidCreditCardException;
import com.flightressystem.model.exceptions.ServiceLoadException;
import com.flightressystem.model.services.ICreditCardSvc;
import com.flightressystem.model.services.factory.ServicesFactory;

/**
 * @author Tasha Wheatley
 * @since 4/10/20
 */

public class CreditCardMgr extends Manager{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");
	
	private static CreditCard CreditCard; 
	
	public CreditCardMgr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean create(CreditCard custCC) throws ServiceLoadException, InvalidCreditCardException{
		ICreditCardSvc iccsvc; 
		boolean action = false;
		try {
			logger.info("Entering method CreditCardMgr: create");
			ServicesFactory servicesFactory = ServicesFactory.getInstance();
			iccsvc = (ICreditCardSvc) servicesFactory.getService(ICreditCardSvc.NAME);
			iccsvc.storeCreditCard(custCC);			
			action = true;
			}
		catch (InvalidCreditCardException e1) {
			logger.error("CreditCardMgr: create - Invalid length of credit card number or expiration date ", e1);
			}
		catch (ServiceLoadException e2) {
			logger.error("CreditCardMgr: create - ServiceLoadException", e2);
			}
		catch (NullPointerException e3) {
			logger.error("CreditCardMgr: create - NullPointerException when reading customer object ", e3);
			}
		catch (Exception e4) {
			logger.error("CreditCardMgr: create - Unexpected Exception Found", e4);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		return action;
	}
	
	public CreditCard get(int id) throws ServiceLoadException, InvalidCreditCardException{
		ICreditCardSvc iccsvc; 
		try {
			logger.info("Entering method CreditCardMgr: get");
			ServicesFactory servicesFactory = ServicesFactory.getInstance();
			iccsvc = (ICreditCardSvc) servicesFactory.getService(ICreditCardSvc.NAME);
			iccsvc.getCreditCard(id);			
			}
		catch (ServiceLoadException e1) {
			logger.error("CreditCardMgr: get - ServiceLoadException ", e1);
			}
		catch (NullPointerException e2) {
			logger.error("CreditCardMgr: get - NullPointerException when reading customer object ", e2);
			}
		catch (Exception e3) {
			logger.error("CreditCardMgr: get - Unexpected Exception Found", e3);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		return CreditCard; 
	}
	
	public boolean update(CreditCard custCC) throws ServiceLoadException, InvalidCreditCardException{
		logger.info("Entering method CreditCardMgr: update");
		return true;
	}
	
	public boolean delete(CreditCard custCC) throws ServiceLoadException, InvalidCreditCardException{
		logger.info("Entering method CreditCardMgr: delete");
		return true;
	}
}
