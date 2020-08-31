package com.flightressystem.model.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;




import org.junit.Test;
import java.lang.ArrayIndexOutOfBoundsException;

import com.flightressystem.model.domain.AvailableFlights;
import com.flightressystem.model.domain.Flight;
import com.flightressystem.model.domain.TravelItinerary;
import com.flightressystem.model.exceptions.AvailableFlightsNotFoundException;
import com.flightressystem.model.exceptions.ServiceLoadException;
import com.flightressystem.model.services.factory.ServicesFactory;


import junit.framework.TestCase;

/**
 * @author Tasha Wheatley
 * @since 3/28/20
 * 
 * 
 */
public class IAvailableFlightsSvcTest extends TestCase{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");
	
	private ServicesFactory servicesFactory;
	private Flight flight; 
	private TravelItinerary itinerary;
	private AvailableFlights availableFlights;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		servicesFactory = ServicesFactory.getInstance(); 
		
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
		
		availableFlights = new AvailableFlights();
	}


	@Test
	public void testStoreAvailableFlights() {				
		IAvailableFlightsSvc iavailflightsvc; 
		try {
			iavailflightsvc = (IAvailableFlightsSvc) servicesFactory.getService(IAvailableFlightsSvc.NAME);
			iavailflightsvc.storeAvailableFlights(availableFlights);
			}
		catch (ArrayIndexOutOfBoundsException e1) {
			logger.error("ArrayIndexOutOfBoundsException");
			e1.printStackTrace();
			}
		catch (ServiceLoadException e2) {
			logger.error("ServiceLoadException");
			e2.printStackTrace();
			}
		catch (AvailableFlightsNotFoundException e3) {
			logger.error("ServiceLoadException");
			e3.printStackTrace();
			}
		catch (NullPointerException e4) {
			logger.error("NullPointerException when reading customer object");
			e4.printStackTrace();
			}
		catch (Exception e5) {
			logger.error("Unexpected Exception Found");
			e5.printStackTrace();
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		
	}

	@Test
	public void testGetAvailableFlights() {	
		IAvailableFlightsSvc iavailflightsvc; 
		try {
			ServicesFactory servicesFactory = ServicesFactory.getInstance();
			iavailflightsvc = (IAvailableFlightsSvc) servicesFactory.getService(IAvailableFlightsSvc.NAME);
			iavailflightsvc.getAvailableFlights(flight, itinerary);
			}
		catch (ServiceLoadException e1) {
			logger.error("ServiceLoadException");
			e1.printStackTrace();
			}
		catch (ArrayIndexOutOfBoundsException e2) {
			logger.error("ArrayIndexOutOfBoundsException");
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

}
