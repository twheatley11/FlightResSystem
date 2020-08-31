package com.flightressystem.model.services;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.flightressystem.model.domain.AvailableFlights;
import com.flightressystem.model.domain.Flight;
import com.flightressystem.model.domain.TravelItinerary;
import com.flightressystem.model.exceptions.AvailableFlightsNotFoundException;

/**
 * @author Tasha Wheatley
 * @since 3/28/20
 * 
 * Implementation for the AvailableFlightsSvc interface.
 */

public class AvailableFlightsSvcImpl implements IAvailableFlightsSvc{

	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");
	
	/**
	 * Stores available flight information in the system.
	 * 
	 *  @param AvailableFlights contains information about flights that are available
	 */
	@Override
	public void storeAvailableFlights(AvailableFlights availableFlights) throws AvailableFlightsNotFoundException{
		logger.info("Entering Method AvailableFlightsSvcImpl: storeAvailableFlights");
		
		try { 
				ObjectOutputStream output = new
				ObjectOutputStream (new FileOutputStream("CustomerFile.out"));
				output.writeObject(availableFlights);
				output.flush();
				output.close();
				}
		catch (ArrayIndexOutOfBoundsException e1) {
			logger.error("AvailableFlightsSvcImpl: storeAvailableFlights - InvalidAirlineException", e1);
			}
		catch (IOException e2) {
			logger.fatal("AvailableFlightsSvcImpl: storeAvailableFlights - IOException when reading from CustomerFile.out", e2);
			}
		catch (NullPointerException e3) {
			logger.error("AvailableFlightsSvcImpl: storeAvailableFlights - NullPointerException when reading customer object", e3);
			}
		catch (Exception e4) {
			logger.error("AvailableFlightsSvcImpl: storeAvailableFlights - Unexpected Exception Found", e4);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
	}

	
	/**
	 * Uses the information stored in the object travel itinerary to find 
	 * an available flight in the system information stored in that airline object.
	 * 
	 *  @param int contains the id for that airline 
	 */
	@Override
	public AvailableFlights getAvailableFlights(Flight flight, TravelItinerary itinerary) {
		logger.info("Entering Method AvailableFlightsFlightSvcImpl: getAvailableFlights");
			
		try {
			ObjectInputStream input = new ObjectInputStream (new FileInputStream("CustomerFile.out"));
			ObjectInputStream input2 = new ObjectInputStream (new FileInputStream("CustomerFile.out"));
			input.readObject();
			input2.readObject();
			input.close();
			input2.close();
		}
		catch (ArrayIndexOutOfBoundsException e1) {
			logger.error("AvailableFlightsFlightSvcImpl: getAvailableFlights - InvalidAirlineException", e1);
			}
		catch (IOException e2) {
			logger.fatal("AvailableFlightsFlightSvcImpl: getAvailableFlights - IOException when reading from CustomerFile.out", e2);
			}
		catch (NullPointerException e3) {
			logger.error("AvailableFlightsFlightSvcImpl: getAvailableFlights - NullPointerException when reading customer object", e3);
			}
		catch (Exception e4) {
			logger.error("AvailableFlightsFlightSvcImpl: getAvailableFlights - Unexpected Exception Found", e4);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		return new AvailableFlights();
	}
	

}
