package com.flightressystem.model.business;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.flightressystem.model.domain.AvailableFlights;
import com.flightressystem.model.domain.Customer;
import com.flightressystem.model.domain.Flight;
import com.flightressystem.model.domain.TravelItinerary;
import com.flightressystem.model.domain.TravelReservation;
import com.flightressystem.model.exceptions.InvalidCustomerException;
import com.flightressystem.model.exceptions.InvalidReservationException;
import com.flightressystem.model.exceptions.ServiceLoadException;
import com.flightressystem.model.services.factory.ServicesFactory;

import junit.framework.TestCase;

public class TravelReservationMgrTest extends TestCase{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");
	
	private TravelReservationMgr travelResMgr;
	private TravelReservation reservation; 
	private Customer customer;
	private TravelItinerary itinerary;
	private AvailableFlights availableFlights;
	private Flight flight;
	private int id; 

	

	@Before
	public void setUp() throws Exception {
		super.setUp();
		ServicesFactory.getInstance();
		
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
		
		travelResMgr = new TravelReservationMgr();
		
	}
	

	@Test
	public void testCreateTravelReservationMgr() throws ServiceLoadException, InvalidCustomerException{
		try {
		assertTrue(Manager.class.isAssignableFrom(CustomerMgr.class));
		assertTrue(travelResMgr.create(reservation));
		}
		catch (InvalidReservationException e1) {
			logger.error("Invalid Account Exception");
			e1.printStackTrace();
		}
		catch (ServiceLoadException e2) {
			logger.error("ServiceLoadException");
			e2.printStackTrace();
			}
		catch (NullPointerException e3) {
			logger.error("NullPointerException when reading travel reservation object");
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
	public void testGetTravelReservationMgr() throws ServiceLoadException, InvalidCustomerException{
		try {
		assertTrue(Manager.class.isAssignableFrom(CustomerMgr.class));
		travelResMgr.get(id);
		}
		catch (InvalidReservationException e1) {
			logger.error("Invalid Account Exception");
			e1.printStackTrace();
		}
		catch (ServiceLoadException e2) {
			logger.error("ServiceLoadException");
			e2.printStackTrace();
			}
		catch (NullPointerException e3) {
			logger.error("NullPointerException when getting travel reservation object");
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
	public void testUpdateTravelReservationMgr() throws ServiceLoadException, InvalidCustomerException{
		try {
		assertTrue(Manager.class.isAssignableFrom(CustomerMgr.class));
		assertTrue(travelResMgr.update(reservation));
		}
		catch (InvalidReservationException e1) {
			logger.error("Invalid Account Exception");
			e1.printStackTrace();
		}
		catch (ServiceLoadException e2) {
			logger.error("ServiceLoadException");
			e2.printStackTrace();
			}
		catch (NullPointerException e3) {
			logger.error("NullPointerException when updating travel reservation object");
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
	public void testDeleteTravelReservationMgr() throws ServiceLoadException, InvalidCustomerException{
		try {
		assertTrue(Manager.class.isAssignableFrom(CustomerMgr.class));
		assertTrue(travelResMgr.delete(reservation));
		}
		catch (InvalidReservationException e1) {
			logger.error("Invalid Account Exception");
			e1.printStackTrace();
		}
		catch (ServiceLoadException e2) {
			logger.error("ServiceLoadException");
			e2.printStackTrace();
			}
		catch (NullPointerException e3) {
			logger.error("NullPointerException when deleting travel reservation object");
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
