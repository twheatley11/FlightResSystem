package com.flightressystem.model.business;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.flightressystem.model.domain.Flight;
import com.flightressystem.model.domain.TravelItinerary;
import com.flightressystem.model.exceptions.InvalidFlightException;
import com.flightressystem.model.exceptions.ServiceLoadException;
import com.flightressystem.model.services.factory.ServicesFactory;

import junit.framework.TestCase;

public class FlightMgrTest extends TestCase{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");
	
	private FlightMgr flightmgr;
	private Flight flight; 
	private TravelItinerary itinerary;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		ServicesFactory.getInstance(); 
		
		flight = new Flight();
		flight.setFlightNum("123");
		flight.setDepartureLocation("Denver");
		flight.setDepartureMonth("July");
		flight.setDepartureDay("30");
		flight.setDepartureYear("2020");
		flight.setDepartureTime("10:00");
		flight.setArrivalLocation("Pittsburgh");
		flight.setArrivalMonth("August");
		flight.setArrivalDay("5");
		flight.setArrivalYear("2020");
		flight.setArrivalTime("3:00");
		flight.setBusSeatsAvail(10);
		flight.setEconSeatsAvail(30);
		flight.setFlightCost(210);
		
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
		
		flightmgr = new FlightMgr();
	}

	@Test
	public void testCreateFlightMgr() throws ServiceLoadException, InvalidFlightException{
		try {
		assertTrue(Manager.class.isAssignableFrom(CustomerMgr.class));
		assertTrue(flightmgr.create(flight));
		}
		catch (InvalidFlightException e1) {
			logger.error("Invalid Flight Exception");
			e1.printStackTrace();
		}
		catch (ServiceLoadException e2) {
			logger.error("ServiceLoadException");
			e2.printStackTrace();
			}
		catch (NullPointerException e3) {
			logger.error("NullPointerException when creating flight object");
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
	public void testGetFlightMgr() throws ServiceLoadException, InvalidFlightException{
		try {
		assertTrue(Manager.class.isAssignableFrom(CustomerMgr.class));
		flightmgr.get(itinerary);
		}
		catch (InvalidFlightException e1) {
			logger.error("Invalid Flight Exception");
			e1.printStackTrace();
		}
		catch (ServiceLoadException e2) {
			logger.error("ServiceLoadException");
			e2.printStackTrace();
			}
		catch (NullPointerException e3) {
			logger.error("NullPointerException when getting flight object");
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
	public void testUpdateFlightMgr() throws ServiceLoadException, InvalidFlightException{
		try {
		assertTrue(Manager.class.isAssignableFrom(CustomerMgr.class));
		assertTrue(flightmgr.update(flight));
		}
		catch (InvalidFlightException e1) {
			logger.error("Invalid Flight Exception");
			e1.printStackTrace();
		}
		catch (ServiceLoadException e2) {
			logger.error("ServiceLoadException");
			e2.printStackTrace();
			}
		catch (NullPointerException e3) {
			logger.error("NullPointerException when updating flight object");
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
	public void testDeleteFlightMgr() throws ServiceLoadException, InvalidFlightException{
		try {
		assertTrue(Manager.class.isAssignableFrom(CustomerMgr.class));
		assertTrue(flightmgr.delete(flight));
		}
		catch (InvalidFlightException e1) {
			logger.error("Invalid Flight Exception");
			e1.printStackTrace();
		}
		catch (ServiceLoadException e2) {
			logger.error("ServiceLoadException");
			e2.printStackTrace();
			}
		catch (NullPointerException e3) {
			logger.error("NullPointerException when deleting flight object");
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
}
