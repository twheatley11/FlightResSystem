package com.flightressystem.model.services;

import com.flightressystem.model.domain.Customer;
import com.flightressystem.model.exceptions.InvalidCustomerException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * @author Tasha Wheatley
 * @since 3/28/20
 * 
 * Implementation for the CustomerSvc interface.
 */

public class CustomerSvcImpl implements ICustomerSvc{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");

	/**
	 * Stores customer information in our system.
	 * 
	 *  @param Customer contains customer's login credentials 
	 * @throws InvalidCustomerException 
	 */
	@Override
	public void storeCustomer(Customer cust) throws InvalidCustomerException {
		logger.info ("Entering Method CustomerSvcImpl: storeCustomer");
		try {
			if (!cust.getFirstName().matches("[a-zA-Z]+")) {
				throw new InvalidCustomerException( "Customer first name must be alphabetic");
			}
			else if (!cust.getLastName().matches("[a-zA-Z]+")) {
					throw new InvalidCustomerException( "Customer first name must be alphabetic");
				}
			else {
				ObjectOutputStream output = new
				ObjectOutputStream (new FileOutputStream("CustomerFile.out"));
				output.writeObject(cust);
				output.flush();
				output.close();		
				}
			}
		catch (InvalidCustomerException e1) {
			logger.error("CustomerSvcImpl: storeCustomer - Invalid Account Exception", e1);
		}
		catch (IOException e2) {
			logger.fatal("CustomerSvcImpl: storeCustomer - IOException when reading from CustomerFile.out", e2);
		}
		catch (NullPointerException e3) {
			logger.error("CustomerSvcImpl: storeCustomer - NullPointerException when reading customer object", e3);
			}
		catch (Exception e4) {
			logger.error("CustomerSvcImpl: storeCustomer - Unexpected Exception Found", e4);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
	}
		
			
		

	/**
	 * Retrieves customer information from our system.
	 * 
	 *  @param id contains a customer's ID number 
	 */
	@Override
	public Customer getCustomer(String username) {
		logger.info ("Entering Method CustomerSvcImpl: getCustomer");
		Customer customer = new Customer();
		try {
			ObjectInputStream input = new ObjectInputStream (new FileInputStream("CustomerFile.out"));
			customer = (Customer) input.readObject();
			input.close();
		}
		catch (IOException e1) {
			logger.fatal("CustomerSvcImpl: getCustomer - IOException when reading from CustomerFile.out", e1);
			}
		catch (NullPointerException e2) {
			logger.error("CustomerSvcImpl: getCustomer - NullPointerException when reading customer object", e2);
			}
		catch (Exception e3) {
			logger.error("CustomerSvcImpl: getCustomer - Unexpected Exception Found", e3);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		return customer;
		}
	}
