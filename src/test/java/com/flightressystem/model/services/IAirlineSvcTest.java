package com.flightressystem.model.services;

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
import com.flightressystem.model.services.factory.ServicesFactory;

import junit.framework.TestCase;

public class IAirlineSvcTest extends TestCase{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");
	
	private ServicesFactory servicesFactory;
	private Airline airline; 
	private int id; 
	private AvailableFlights availableFlights;
	
	List<Flight> flightList = new ArrayList<Flight>();

	@Before
	public void setUp() throws Exception {
		super.setUp();
		servicesFactory = ServicesFactory.getInstance();
		
		airline = new Airline ();
		airline = new Airline ();
		airline.setAirlineName("United Airlines");
		airline.setAirlineCode("UA");
		airline.setFlightList(flightList);
		airline.setAvailableFlights(availableFlights);
		
		id = 12345;
	}
	
	@Test
	public void testStoreAirline() {				
		IAirlineSvc iairlinesvc; 
		try {
			iairlinesvc = (IAirlineSvc) servicesFactory.getService(IAirlineSvc.NAME);
			iairlinesvc.storeAirline(airline);
			}
		catch (ServiceLoadException e1) {
			logger.error("ServiceLoadException");
			e1.printStackTrace();
			}
		catch (InvalidAirlineException e2) {
			logger.error("Invalid length of credit card number or expiration date");
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
	public void testGetAirline() {		
		IAirlineSvc iairlinesvc; 
		try {
			iairlinesvc = (IAirlineSvc) servicesFactory.getService(IAirlineSvc.NAME);
			iairlinesvc.getAirline(id);
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
