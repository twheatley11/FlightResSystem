package com.flightressystem.model.services;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.flightressystem.model.domain.Airline;
import com.flightressystem.model.exceptions.InvalidAirlineException;

/**
 * @author Tasha Wheatley
 * @since 3/28/20
 * 
 * Implementation for the AirlineSvc interface.
 */

public class AirlineSvcImpl implements IAirlineSvc {

	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");
	
	/**
	 * Stores airline information in the system.
	 * 
	 *  @param Airline contains information about the airline 
	 */
	@Override
	public void storeAirline(Airline airline) throws InvalidAirlineException{
		logger.info("Entering method AirlineSvcImpl: storeAirline");	
		String airlineCode = airline.getAirlineCode();
		try { 
			
			if(airlineCode.length() != 2) {
				throw new InvalidAirlineException ("Airline code is invalid");
			}
			else {
				ObjectOutputStream output = new
				ObjectOutputStream (new FileOutputStream("CustomerFile.out"));
				output.writeObject(airline);
				output.flush();
				output.close();
				}
				}
		catch (InvalidAirlineException e1) {
			logger.error("AirlineSvcImpl: storeAirline - InvalidAirlineException", e1);
			}
		catch (IOException e2) {
			logger.fatal("AirlineSvcImpl: storeAirline - IOException when reading from CustomerFile.out", e2);
			}
		catch (NullPointerException e3) {
			logger.error("AirlineSvcImpl: storeAirline - NullPointerException when reading customer object", e3);
			}
		catch (Exception e4) {
			logger.error("AirlineSvcImpl: storeAirline - Unexpected Exception Found", e4);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
		}
	}

	/**
	 * Uses the airline id to find an airline in the system and return the
	 * information stored in that airline object.
	 * 
	 *  @param int contains the id for that airline 
	 */
	@Override
	public Airline getAirline(int id){
		logger.info("Entering method AirlineSvcImpl: getAirline");
		try {
			ObjectInputStream input = new ObjectInputStream (new FileInputStream("CustomerFile.out"));
			input.readObject();
			input.close();
		}
		catch (IOException e1) {
			logger.fatal("AirlineSvcImpl: getAirline - IOException when reading from CustomerFile.out", e1);
			}
		catch (NullPointerException e2) {
			logger.error("AirlineSvcImpl: getAirline - NullPointerException when reading customer object", e2);
			}
		catch (Exception e3) {
			logger.error("AirlineSvcImpl: getAirline - Unexpected Exception Found", e3);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		return new Airline();
	}

}
