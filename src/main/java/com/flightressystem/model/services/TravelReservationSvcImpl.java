package com.flightressystem.model.services;

import java.io.FileInputStream;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.flightressystem.model.domain.TravelReservation;
import com.flightressystem.model.exceptions.InvalidReservationException;
import org.apache.logging.log4j.*;


/**
 * @author Tasha Wheatley
 * @since 3/28/20
 * 
 * Implementation for the TravelReservationSvc interface.
 */

public class TravelReservationSvcImpl implements ITravelReservationSvc {
	
	static private Logger logger = LogManager.getRootLogger();
	
	/**
	 * Stores travel reservation information in our system.
	 * 
	 *  @param TravelReservation contains customer information, travel itinerary, and flights
	 */
	@Override
	public void storeTravelReservation(TravelReservation reservation) throws InvalidReservationException{
		logger.info ("Entering Method TravelReservationSvcImpl: storeTravelReservation");
		try { 
			ObjectOutputStream output = new
			ObjectOutputStream (new FileOutputStream("CustomerFile.out"));
			output.writeObject(reservation);
			output.flush();
			output.close();
			}
		catch (IOException e1) {
			logger.fatal("TravelReservationSvcImpl: storeTravelReservation - IOException when reading from CustomerFile.out", e1);
			}
		catch (NullPointerException e2) {
			logger.error("TravelReservationSvcImpl: storeTravelReservation - NullPointerException when reading customer object", e2);
			}
		catch (Exception e3) {
			logger.error("TravelReservationSvcImpl: storeTravelReservation - Unexpected Exception Found", e3);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
		}
	}

	/**
	 * Retrieves travel reservations from our system.
	 * 
	 *  @param id contains an ID number
	 */
	@Override
	public TravelReservation getTravelReservation(int id) {
		logger.info ("Entering Method TravelReservationSvcImpl: getTravelReservation");
		try {
			ObjectInputStream input = new ObjectInputStream (new FileInputStream("CustomerFile.out"));
			input.readObject();
			input.close();
		}
		catch (IOException e1) {
			logger.fatal("TravelReservationSvcImpl: getTravelReservation - IOException when reading from CustomerFile.out", e1);
			e1.printStackTrace();
			}
		catch (NullPointerException e2) {
			logger.error("TravelReservationSvcImpl: getTravelReservation - NullPointerException when reading customer object", e2);
			e2.printStackTrace();
			}
		catch (Exception e3) {
			logger.error("TravelReservationSvcImpl: getTravelReservation - Unexpected Exception Found", e3);
			e3.printStackTrace();
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		return new TravelReservation();
	}

	

	
}
