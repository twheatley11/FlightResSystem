package com.flightressystem.model.services;

import java.io.FileInputStream;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.apache.logging.log4j.*;


import com.flightressystem.model.domain.TravelItinerary;
import com.flightressystem.model.exceptions.InvalidItineraryException;

/**
 * @author Tasha Wheatley
 * @since 3/28/20
 * 
 * Implementation for the TravelItinerarySvc interface.
 */

public class TravelItinerarySvcImpl implements ITravelItinerarySvc{
	
	static private Logger logger = LogManager.getLogger("com.flightressystem");
	
	/**
	 * Stores travel itinerary information in our system.
	 * 
	 *  @param TravelItinerary contains a customers travel specifications
	 */
	@Override
	public void storeTravelItinerary(TravelItinerary itinerary) throws InvalidItineraryException{
		logger.info("Entering Method TravelItinerarySvcImpl: storeTravelItinerary");
		try { 
			ObjectOutputStream output = new
			ObjectOutputStream (new FileOutputStream("CustomerFile.out"));
			output.writeObject(itinerary);  //method for serialization of object
			output.flush();
			output.close();
			}
		catch (IOException e1) {
			logger.fatal("TravelItinerarySvcImpl: storeTravelItinerary - IOException when reading from CustomerFile.out", e1);
			}
		catch (NullPointerException e2) {
			logger.error("TravelItinerarySvcImpl: storeTravelItinerary - NullPointerException when reading customer object", e2);
			}
		catch (Exception e3) {
			logger.error("TravelItinerarySvcImpl: storeTravelItinerary - Unexpected Exception Found", e3);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
		}
	}

	/**
	 * Retrieves travel itinerary information from our system.
	 * 
	 *  @param id contains an ID number
	 */
	@Override
	public TravelItinerary getTravelItinerary(int id){
		logger.info ("Entering Method TravelItinerarySvcImpl: getTravelItinerary");
		try {
			ObjectInputStream input = new ObjectInputStream (new FileInputStream("CustomerFile.out"));
			input.readObject();  //method for deserialization of object
			input.close();
		}
		catch (IOException e1) {
			logger.fatal("TravelItinerarySvcImpl: getTravelItinerary - IOException when reading from CustomerFile.out", e1);
			}
		catch (NullPointerException e2) {
			logger.error("TravelItinerarySvcImpl: getTravelItinerary - NullPointerException when reading customer object", e2);
			}
		catch (Exception e3) {
			logger.error("TravelItinerarySvcImpl: getTravelItinerary - Unexpected Exception Found", e3);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		return new TravelItinerary();
	}


}
