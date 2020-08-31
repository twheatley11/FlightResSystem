package com.flightressystem.model.services;

import org.junit.Before;


import org.junit.Test;

import com.flightressystem.model.domain.TravelItinerary;
import com.flightressystem.model.exceptions.InvalidItineraryException;
import com.flightressystem.model.exceptions.ServiceLoadException;
import com.flightressystem.model.services.factory.ServicesFactory;
import org.apache.logging.log4j.*;


import junit.framework.TestCase;

/**
 * @author Tasha Wheatley
 * @since 3/28/20
 * 
 * 
 */

public class ITravelItinerarySvcTest extends TestCase{
	
	static private Logger logger = LogManager.getRootLogger();
	
	private ServicesFactory servicesFactory;
	private TravelItinerary itinerary; 
	private int id; 

	@Before
	public void setUp() throws Exception {
		super.setUp();
		servicesFactory = ServicesFactory.getInstance(); 
		
		itinerary = new TravelItinerary();
		itinerary.setNumPassengers(2);
		itinerary.setOneWayTrip(true);
		itinerary.setRoundTrip(false);
		itinerary.setDepartureLocation("Denver");
		itinerary.setDepartureMonth("July");
		itinerary.setDepartureDay("30");
		itinerary.setDepartureYear("2020");
		itinerary.setDepartureTime("10:00");
		itinerary.setArrivalLocation("Pittsburgh");
		itinerary.setArrivalMonth("August");
		itinerary.setArrivalDay("5");
		itinerary.setArrivalYear("2020");
		itinerary.setArrivalTime("3:00");
		
		id = 12345;
	}

	@Test
	public void testStoreTravelItinerary() {
		ITravelItinerarySvc itravelitinsvc;
		try {
			itravelitinsvc = (ITravelItinerarySvc) servicesFactory.getService(ITravelItinerarySvc.NAME);
			itravelitinsvc.storeTravelItinerary(itinerary);
			}
		catch (ServiceLoadException e1) {
			logger.error("ServiceLoadException");
			e1.printStackTrace();
			}
		catch (InvalidItineraryException e2) {
			logger.error("InvalidItineraryException");
			e2.printStackTrace();
		}
		catch (NullPointerException e3) {
			logger.error("NullPointerException when reading customer object");
			e3.printStackTrace();
			}
		catch (Exception e4) {
			logger.error("Unexpected Exception Found");
			e4.printStackTrace();
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		
	}
	
	@Test
	public void testGetTravelItinerary() {
		logger.trace("starting testGetTravelItinerary()");
		
		ITravelItinerarySvc itravelitinsvc; 
		try {
			itravelitinsvc = (ITravelItinerarySvc) servicesFactory.getService(ITravelItinerarySvc.NAME);
			itravelitinsvc.getTravelItinerary(id);
			}
		catch (ServiceLoadException e1) {
			logger.error("ServiceLoadException");
			e1.printStackTrace();
			}
		catch (NullPointerException e2) {
			logger.error("NullPointerException when reading customer object");
			e2.printStackTrace();
			}
		catch (Exception e3) {
			logger.error("Unexpected Exception Found");
			e3.printStackTrace();
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
	}
}
