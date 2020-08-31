package com.flightressystem.model.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;

import org.junit.Test;

import com.flightressystem.model.domain.AvailableFlights;
import com.flightressystem.model.domain.Customer;
import com.flightressystem.model.domain.Flight;
import com.flightressystem.model.domain.TravelItinerary;
import com.flightressystem.model.domain.TravelReservation;
import com.flightressystem.model.exceptions.InvalidReservationException;
import com.flightressystem.model.exceptions.ServiceLoadException;
import com.flightressystem.model.services.factory.ServicesFactory;

import junit.framework.TestCase;

/**
 * @author Tasha Wheatley
 * @since 3/28/20
 * 
 * 
 */
public class ITravelReservationSvcTest extends TestCase{
	
	// use the root logger
	static private Logger logger = LogManager.getRootLogger();

	private ServicesFactory servicesFactory;
	private TravelReservation reservation; 
	private Customer customer;
	private TravelItinerary itinerary;
	private AvailableFlights availableFlights;
	private Flight flight;
	private int id; 
	

		@Before
	public void setUp() throws Exception {
		super.setUp();
		servicesFactory = ServicesFactory.getInstance();
		
		customer = new Customer();
		customer.setLastName("Wheatley");
		customer.setFirstName("Tasha");
		customer.setUserName("twheatley");
		customer.setPassword("12345");
		customer.setEmailAddress("twheatley@regis.edu");
		customer.setAddress("1234 Main Street");
		customer.setCity("Denver");
		customer.setState("Colorado");
		customer.setZipCode(12345);
		customer.setCustID(11111);
		
		reservation = new TravelReservation();
		reservation.setCustomer(customer);
		reservation.setTravelItinerary(itinerary);
		reservation.setAvailableFlights(availableFlights);
		reservation.setFlight(flight);
		
		id = 12345;
		
	}

		@Test
		public void testStoreTravelReservation() {	
			ITravelReservationSvc itravelressvc; 
			try {
				itravelressvc = (ITravelReservationSvc) servicesFactory.getService(ITravelReservationSvc.NAME);
				itravelressvc.storeTravelReservation(reservation);
				}
			catch (ServiceLoadException e1) {
				logger.error("ServiceLoadException");
				e1.printStackTrace();
				}
			catch (InvalidReservationException e2) {
				logger.error("InvalidReservationException");
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
		public void testGetTravelReservation() {					
			ITravelReservationSvc itravelressvc; 
			try {
				itravelressvc = (ITravelReservationSvc) servicesFactory.getService(ITravelReservationSvc.NAME);
				itravelressvc.getTravelReservation(id);
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
