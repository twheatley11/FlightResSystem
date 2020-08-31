package com.flightressystem.model.domain;

import static org.junit.Assert.*;


import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class AvailableFlightsTest {

	private AvailableFlights availableFlight1, availableFlight2, availableFlight3, availableFlight4; 
	
	ArrayList<Flight> availableFlightList = new ArrayList<Flight>();
	ArrayList<Flight> availableFlightList2 = new ArrayList<Flight>();
	
	@Before
	public void setUp() throws Exception {
				
		availableFlight1 = new AvailableFlights ();
		availableFlight1.setFlightAvailable(true);
		availableFlight1.setAvailableFlightsList(availableFlightList);
		
		availableFlight2 = new AvailableFlights ();
		availableFlight2.setFlightAvailable(true);
		availableFlight2.setAvailableFlightsList(availableFlightList);
		
		availableFlight3 = new AvailableFlights ();
		availableFlight3.setFlightAvailable(false);
		availableFlight3.setAvailableFlightsList(availableFlightList2);
		
		availableFlight4 = new AvailableFlights ();
	}

	// Test method that validates that all customer input is valid
	@Test
	public void testValidateAvailableFlights() {
		assertTrue ("available flight validates", availableFlight1.validate());
	}

	// Test method that does not validate because none of the parameters are passed
	@Test
	public void testNotValidateAvailableFlights() {
		assertFalse ("available flight does not validates", availableFlight4.validate());
	}

	// Test method that checks if two airline variables hold identical values
	@Test
	public final void testEqualsAvailableFlights() {
		assertTrue ("airline1 equals airline2", availableFlight1.equals(availableFlight2));
		}
	
	// Test method that checks if two customer variables do not hold identical values
	@Test
	public final void testNotEqualsAvailableFlights() {
		assertFalse ("airline1 equals airline2", availableFlight1.equals(availableFlight3));
		}
}
