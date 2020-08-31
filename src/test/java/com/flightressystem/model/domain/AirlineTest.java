package com.flightressystem.model.domain;

import static org.junit.Assert.*;


import java.util.List;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class AirlineTest {
	
	private Airline airline1, airline2, airline3, airline4;
	
	private AvailableFlights availableFlights;
	
	List<Flight> flightList = new ArrayList<Flight>();
	
	
	@Before
	public void setUp() throws Exception {
		
		airline1 = new Airline ();
		airline1.setAirlineName("United Airlines");
		airline1.setAirlineCode("UA");
		airline1.setFlightList(flightList);
		airline1.setAvailableFlights(availableFlights);
		
		
		
		airline2 = new Airline ();
		airline2.setAirlineName("United Airlines");
		airline2.setAirlineCode("UA");
		airline2.setFlightList(flightList);
		airline2.setAvailableFlights(availableFlights);
		
		airline3 = new Airline ();
		airline3.setAirlineName("Alaskan Airlines");
		airline3.setAirlineCode("AS");
		airline3.setFlightList(flightList);
		airline3.setAvailableFlights(availableFlights);
		
		airline4 = new Airline ();
	}

	// Test method that validates that all airline input is valid
	@Test
	public void testValidateAirline() {
		assertTrue ("flight validates", airline1.validate());
	}
	
	// Test method that does not validate because none of the parameters are passed
	@Test
	public void testNotValidateAirline() {
		assertFalse ("flight validates", airline4.validate());
	}

	// Test method that checks if two airline variables hold identical values
	@Test
	public final void testEqualsAirline() {
		assertTrue ("airline1 equals airline2", airline1.equals(airline2));
		}
	
	// Test method that checks if two airline variables do not hold identical values
		@Test
		public final void testNotEqualsAirline() {
			assertFalse ("airline1 equals airline3", airline1.equals(airline3));
			}
}
