package com.flightressystem.model.services;

import java.io.FileInputStream;


import java.io.FileOutputStream;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.flightressystem.model.domain.Flight;
import com.flightressystem.model.domain.TravelItinerary;
import com.flightressystem.model.exceptions.InvalidFlightException;

/**
 * @author Tasha Wheatley
 * @since 3/28/20
 * 
 * Implementation for the FlightSvc interface.
 */

public class FlightSvcImpl implements IFlightSvc{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");

	/**
	 * Stores flight information in our system.
	 * 
	 *  @param Customer contains information about a specific flight 
	 */
	@Override
	public void storeFlight(Flight flight) throws InvalidFlightException{
		logger.info ("Entering Method FlightSvcImpl: storeFlight");
		String flightNum = flight.getFlightNum();
		Integer busSeats = flight.getBusSeatsAvail();
		Integer econSeats = flight.getEconSeatsAvail();
		try { 
			
			if(flightNum.length() != 3) {
				throw new InvalidFlightException ("Flight number must be 3-digits");
			}
			else if(busSeats < 0 || busSeats > 10) {
				throw new InvalidFlightException ("Invalid number of business class seats");
			}
			else if(econSeats < 0 || econSeats > 30) {
				throw new InvalidFlightException ("Invalid number of economy class seats");
			}
			else {
				ObjectOutputStream output = new
				ObjectOutputStream (new FileOutputStream("CustomerFile.out"));
				output.writeObject(flight);
				output.flush();
				output.close();
				}
		}
		catch (IOException e1) {
			logger.fatal("FlightSvcImpl: storeFlight - IOException when reading from CustomerFile.out", e1);
			}
		catch (NullPointerException e2) {
			logger.error("FlightSvcImpl: storeFlight - NullPointerException when reading customer object", e2);
			}
		catch (Exception e3) {
			logger.error("FlightSvcImpl: storeFlight - Unexpected Exception Found", e3);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
		}
	}

	
	/**
	 * Retrieves customer information from our system.
	 * 
	 *  @param TravelItinerary contains a customers travel specifications
	 */
	@Override
	public Flight getFlight(TravelItinerary itinerary){
		logger.info ("Entering Method FlightSvcImpl: getFlight");
		try {
			ObjectInputStream input = new ObjectInputStream (new FileInputStream("CustomerFile.out"));
			input.readObject();
			input.close();
		}
		catch (IOException e1) {
			logger.fatal("FlightSvcImpl: getFlight - IOException when reading from CustomerFile.out", e1);
			}
		catch (NullPointerException e2) {
			logger.error("FlightSvcImpl: getFlight - NullPointerException when reading customer object", e2);
			}
		catch (Exception e3) {
			logger.error("FlightSvcImpl: getFlight - Unexpected Exception Found", e3);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		return new Flight();
	}


}
