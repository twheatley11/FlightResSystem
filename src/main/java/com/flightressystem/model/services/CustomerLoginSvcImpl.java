package com.flightressystem.model.services;

import java.io.FileInputStream;




import java.io.IOException;
import java.io.ObjectInputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.flightressystem.model.domain.Customer;
import com.flightressystem.model.domain.TravelReservation;
import com.flightressystem.model.exceptions.LoginNotFoundException;

/**
 * @author Tasha Wheatley
 * @since 3/28/20
 * 
 * Implementation for the CustomerLoginSvc interface.
 */

public class CustomerLoginSvcImpl implements ICustomerLoginSvc{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");
		
	/**
	 * Authenticates the customer which means they are registered in the system. 
	 * 
	 *  @param Customer contains customer's login credentials 
	 */
	public boolean authenticateCustomerLogin(TravelReservation travelReservation) throws LoginNotFoundException{
		logger.info ("Entering method CustomerLoginSvcImpl:authenticateCustomer");
		boolean isValid = false; 
		ObjectInputStream input = null;
		
		try {		
		input = new ObjectInputStream (new FileInputStream("CustomerFile.out"));
	
		Customer savedCustomer = (Customer) input.readObject();
		
		Customer inCustomer = travelReservation.getCustomer();
		input.close();
		if (inCustomer != null) {
			if (savedCustomer.equals(inCustomer))
				isValid = true;
			else
				isValid = false;
		} else {
			throw new LoginNotFoundException ("Invalid username or password"); 
		}
		
		}
		catch (LoginNotFoundException e1) {
			logger.info("CustomerLoginSvcImpl:authenticateCustomer - Invalid username or password", e1);
			}
		catch (IOException e2) {
			logger.fatal("CustomerLoginSvcImpl:authenticateCustomer - IOException when reading from CustomerFile.out", e2);
			}
		catch (ClassNotFoundException e3) {
			logger.error("CustomerLoginSvcImpl:authenticateCustomer - IOException when reading from CustomerFile.out", e3);
			}
		catch (NullPointerException e4) {
			logger.error("CustomerLoginSvcImpl:authenticateCustomer - NullPointerException when reading customer object", e4);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		return isValid;	
		}
}
		
		
		
