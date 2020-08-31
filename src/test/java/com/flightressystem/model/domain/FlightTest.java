package com.flightressystem.model.domain;

import static org.junit.Assert.*;



import org.junit.Before;
import org.junit.Test;

public class FlightTest {
	
	private Flight flight1, flight2, flight3, flight4;  

	@Before
	public void setUp() throws Exception {
		flight1 = new Flight();
		flight1.setFlightNum("123");
		flight1.setDepartureLocation("Denver");
		flight1.setDepartureMonth("July");
		flight1.setDepartureDay("30");
		flight1.setDepartureYear("2020");
		flight1.setDepartureTime("10:00");
		flight1.setArrivalLocation("Pittsburgh");
		flight1.setArrivalMonth("August");
		flight1.setArrivalDay("5");
		flight1.setArrivalYear("2020");
		flight1.setArrivalTime("3:00");
		flight1.setBusSeatsAvail(10);
		flight1.setEconSeatsAvail(30);
		flight1.setFlightCost(210);
		
		
		flight2 = new Flight();
		flight2.setFlightNum("123");
		flight2.setDepartureLocation("Denver");
		flight2.setDepartureMonth("July");
		flight2.setDepartureDay("30");
		flight2.setDepartureYear("2020");
		flight2.setDepartureTime("10:00");
		flight2.setArrivalLocation("Pittsburgh");
		flight2.setArrivalMonth("August");
		flight2.setArrivalDay("5");
		flight2.setArrivalYear("2020");
		flight2.setArrivalTime("3:00");
		flight2.setBusSeatsAvail(10);
		flight2.setEconSeatsAvail(30);
		flight2.setFlightCost(210);
		
		flight3 = new Flight();
		flight3.setFlightNum("234");
		flight3.setDepartureLocation("Denver");
		flight3.setDepartureMonth("July");
		flight3.setDepartureDay("30");
		flight3.setDepartureYear("2020");
		flight3.setDepartureTime("10:00");
		flight3.setArrivalLocation("Pittsburgh");
		flight3.setArrivalMonth("August");
		flight3.setArrivalDay("5");
		flight3.setArrivalYear("2020");
		flight3.setArrivalTime("3:00");
		flight3.setBusSeatsAvail(10);
		flight3.setEconSeatsAvail(30);
		flight3.setFlightCost(210);
		
		flight4 = new Flight();
	}

	// Test method that validates that all flight input is valid
	@Test
	public final void testValidateFlight() {
		assertTrue ("flight validates", flight1.validate());
	}
		
	// Test method that does not validate because none of the parameters are passed
	@Test
	public final void testNotValidateFlight() {
		assertFalse ("flight validates", flight4.validate());
	}

	// Test method that checks if two flight variables hold identical values
	@Test
	public final void testEqualsFlight() {
		assertTrue ("flight1 equals flight2", flight1.equals(flight2));
		}
		
	// Test method that checks if two flight variables do not hold identical values
	@Test
	public final void testNotEqualsFlight() {
		assertFalse ("flight 1 equals flight3", flight1.equals(flight3));
	}


}
