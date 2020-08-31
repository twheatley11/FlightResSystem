package com.flightressystem.model.business;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.flightressystem.model.domain.Customer;
import com.flightressystem.model.exceptions.InvalidCustomerException;
import com.flightressystem.model.exceptions.ServiceLoadException;
import com.flightressystem.model.services.ICustomerSvc;
import com.flightressystem.model.services.factory.ServicesFactory;

/**
 * @author Tasha Wheatley
 * @since 4/10/20
 */

public class CustomerMgr extends Manager{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");
	
	private static Customer Customer; 
	
	public CustomerMgr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean create(Customer customer) throws ServiceLoadException, InvalidCustomerException{
		boolean action = false;
		try {
		logger.info("Entering method CustomerMgr: create");
		ServicesFactory servicesFactory = ServicesFactory.getInstance();
		ICustomerSvc custSvc = (ICustomerSvc)servicesFactory.getService(ICustomerSvc.NAME);
		custSvc.storeCustomer(customer);
		action = true;
		}
		catch (InvalidCustomerException e1) {
			logger.error("CustomerMgr: create - Invalid Account Exception", e1);
		}
		catch (ServiceLoadException e2) {
			logger.error("CustomerMgr: create - ServiceLoadException", e2);
			}
		catch (NullPointerException e3) {
			logger.error("CustomerMgr: create - NullPointerException when reading customer object", e3);
			}
		catch (Exception e4) {
			logger.error("CustomerMgr: create - Unexpected Exception Found", e4);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		return action;
		}
	
	public Customer get(String username) throws ServiceLoadException, InvalidCustomerException{
		try {
		logger.info("Entering method CustomerMgr: get");
		ServicesFactory servicesFactory = ServicesFactory.getInstance();
		ICustomerSvc custSvc = (ICustomerSvc)servicesFactory.getService(ICustomerSvc.NAME);
		custSvc.getCustomer(username);
		}
		catch (ServiceLoadException e1) {
			logger.error("ServiceLoadException", e1);
			}
		catch (Exception e2) {
			logger.error("Unexpected Exception Found", e2);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		return Customer;
	}
	
	public boolean update(Customer customer)  throws ServiceLoadException, InvalidCustomerException{
		logger.info("Entering method CustomerMgr: update");
		return true;
		
	}
	
	public boolean delete(Customer customer)  throws ServiceLoadException, InvalidCustomerException{
		logger.info("Entering method CustomerMgr: delete");
		return true;
		
	}
	
	public boolean generateStatement(Customer customer)  throws ServiceLoadException, InvalidCustomerException{
		logger.info("Entering method CustomerMgr: generateStatement");
		return true;
		
	}
	
}
