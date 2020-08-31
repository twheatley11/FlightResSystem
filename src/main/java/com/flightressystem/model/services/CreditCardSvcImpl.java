package com.flightressystem.model.services;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.flightressystem.model.domain.CreditCard;
import com.flightressystem.model.exceptions.InvalidCreditCardException;

/**
 * @author Tasha Wheatley
 * @since 3/28/20
 * 
 * Implementation for the CreditCardSvc interface.
 */

public class CreditCardSvcImpl implements ICreditCardSvc{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");

	/**
	 * Stores credit card information in the system.
	 * 
	 *  @param CreditCard contains information about a customer's credit card 
	 */
	@Override
	public void storeCreditCard(CreditCard creditCard) throws InvalidCreditCardException{
		logger.info("Entering Method CreditCardSvcImpl: storeCreditCard");
		String ccNum = creditCard.getCreditCardNum();
		String ccExp = creditCard.getCreditCardExp();
		try { 
			
			if(ccNum.length() != 16) {
				throw new InvalidCreditCardException ("Length of credit card number is not valid");
			}
			else if(ccExp.length() != 4) {
					throw new InvalidCreditCardException ("Length of credit card expiration date is not valid");
			}
			else {
				ObjectOutputStream output = new
				ObjectOutputStream (new FileOutputStream("CustomerFile.out"));
				output.writeObject(creditCard);
				output.flush();
				output.close();
				}
				}
		catch (InvalidCreditCardException e1) {
			logger.error("CreditCardSvcImpl: storeCreditCard - Invalid length of credit card number or expiration date", e1);
			}
		catch (IOException e2) {
			logger.fatal("CreditCardSvcImpl: storeCreditCard - IOException when reading from CustomerFile.out", e2);
			}
		catch (NullPointerException e3) {
			logger.error("CreditCardSvcImpl: storeCreditCard - NullPointerException when reading customer object", e3);
			}
		catch (Exception e4) {
			logger.error("CreditCardSvcImpl: storeCreditCard - Unexpected Exception Found");
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
	}
	



	/**
	 * Retrieves credit card information from our system.
	 * 
	 *  @param id contains a customer's ID number 
	 */
	@Override
	public CreditCard getCreditCard(int id){
		logger.info("Entering Method CreditCardSvcImpl: getCreditCard");
	
		try {	
			ObjectInputStream input = new ObjectInputStream (new FileInputStream("CustomerFile.out"));
			input.readObject();
			input.close();
		}
		catch (IOException e1) {
			logger.fatal("CreditCardSvcImpl: getCreditCard - IOException when reading from CustomerFile.out", e1);
			}
		catch (NullPointerException e2) {
			logger.error("CreditCardSvcImpl: getCreditCard - NullPointerException when reading customer object", e2);
			}
		catch (Exception e3) {
			logger.error("CreditCardSvcImpl: getCreditCard - Unexpected Exception Found", e3);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		return new CreditCard();
		}
	}
