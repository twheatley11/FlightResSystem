package com.flightressystem.model.business;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.flightressystem.model.domain.Customer;

import com.flightressystem.model.domain.CustomerLogin;
import com.flightressystem.model.exceptions.LoginNotFoundException;
import com.flightressystem.model.exceptions.ServiceLoadException;
import com.flightressystem.model.services.ICustomerSvc;
import com.flightressystem.model.services.factory.ServicesFactory;

public class CustomerLoginMgr extends Manager{

	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");
	
	public CustomerLoginMgr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean create(CustomerLogin custLogin) throws ServiceLoadException, LoginNotFoundException{
		logger.info("Entering method CustomerLoginMgr: create");
		return true;
	}
	
	public boolean update(CustomerLogin custLogin) throws ServiceLoadException, LoginNotFoundException{
		logger.info("Entering method CustomerLoginMgr: update");
		return true;
	}
	
	public boolean delete(CustomerLogin custLogin) throws ServiceLoadException, LoginNotFoundException{
		logger.info("Entering method CustomerLoginMgr: delete");
		return true;
	}

	public boolean authenticate(CustomerLogin custLogin) {
		boolean authenticate = false;
		Customer customer = new Customer();
		try {
			logger.info("Entering method CustomerLoginMgr: authenticate");
			ServicesFactory servicesFactory = ServicesFactory.getInstance();
			ICustomerSvc custSvc;
		
			custSvc = (ICustomerSvc)servicesFactory.getService(ICustomerSvc.NAME);
		
			customer = custSvc.getCustomer(custLogin.getUsername());
			logger.info("The authenticated customer is " + custLogin + "" + customer);
			if(custLogin.getUsername().contentEquals(customer.getUserName()) && 
					custLogin.getPassword().contentEquals(customer.getPassword())) {
				authenticate = true;	
			}
			else
				authenticate = false;
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return authenticate;
		
}
}
	
