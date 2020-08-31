package com.flightressystem.model.business;

import java.util.ArrayList;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.flightressystem.model.domain.Airline;
import com.flightressystem.model.domain.AvailableFlights;
import com.flightressystem.model.domain.Flight;
import com.flightressystem.model.exceptions.InvalidAirlineException;
import com.flightressystem.model.exceptions.ServiceLoadException;
import junit.framework.TestCase;

public class AirlineMgrTest extends TestCase{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");
		
	private AirlineMgr airlinemgr;
	private Airline airline; 
	private int id; 
	private AvailableFlights availableFlights;
	
	
	
	List<Flight> flightList = new ArrayList<Flight>();
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		
		airline = new Airline ();
		airline = new Airline ();
		airline.setAirlineName("United Airlines");
		airline.setAirlineCode("UA");
		airline.setFlightList(flightList);
		airline.setAvailableFlights(availableFlights);
		
		id = 12345;
		
		airlinemgr = new AirlineMgr();
	}

	@Test
	public void testCreateAirlineMgr() throws ServiceLoadException, InvalidAirlineException{
		try {
		assertTrue(Manager.class.isAssignableFrom(AirlineMgr.class));
		assertTrue(airlinemgr.create(airline));
		}
		catch (InvalidAirlineException e1) {
			logger.error("Invalid Account Exception");
			e1.printStackTrace();
		}
		catch (ServiceLoadException e2) {
			logger.error("ServiceLoadException");
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
	public void testGetAirlineMgr() throws ServiceLoadException, InvalidAirlineException{
		try {
		assertTrue(Manager.class.isAssignableFrom(AirlineMgr.class));
		airlinemgr.get(id);
		}
		catch (InvalidAirlineException e1) {
			logger.error("Invalid Account Exception");
			e1.printStackTrace();
		}
		catch (ServiceLoadException e2) {
			logger.error("ServiceLoadException");
			e2.printStackTrace();
			}
		catch (NullPointerException e3) {
			logger.error("NullPointerException when creating airline object");
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
	public void testUpdateAirlineMgr() throws ServiceLoadException, InvalidAirlineException{
		try {
		assertTrue(Manager.class.isAssignableFrom(AirlineMgr.class));
		assertTrue(airlinemgr.update(airline));
		}
		catch (InvalidAirlineException e1) {
			logger.error("Invalid Account Exception");
			e1.printStackTrace();
		}
		catch (ServiceLoadException e2) {
			logger.error("ServiceLoadException");
			e2.printStackTrace();
			}
		catch (NullPointerException e3) {
			logger.error("NullPointerException when updating airline object");
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
	public void testDeleteAirlineMgr() throws ServiceLoadException, InvalidAirlineException{
		try {
		assertTrue(Manager.class.isAssignableFrom(AirlineMgr.class));
		assertTrue(airlinemgr.delete(airline));
		}
		catch (InvalidAirlineException e1) {
			logger.error("Invalid Account Exception");
			e1.printStackTrace();
		}
		catch (ServiceLoadException e2) {
			logger.error("ServiceLoadException");
			e2.printStackTrace();
			}
		catch (NullPointerException e3) {
			logger.error("NullPointerException when deleting airline object");
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
