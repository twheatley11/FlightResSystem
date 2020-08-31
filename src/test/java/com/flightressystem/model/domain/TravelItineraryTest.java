package com.flightressystem.model.domain;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class TravelItineraryTest {
	
	private TravelItinerary itinerary1, itinerary2, itinerary3, itinerary4;

	@Before
	public void setUp() throws Exception {
		
		itinerary1 = new TravelItinerary();
		itinerary1.setNumPassengers(2);
		itinerary1.setOneWayTrip(true);
		itinerary1.setRoundTrip(true);
		itinerary1.setDepartureLocation("Denver");
		itinerary1.setDepartureMonth("July");
		itinerary1.setDepartureDay("30");
		itinerary1.setDepartureYear("2020");
		itinerary1.setDepartureTime("10:00");
		itinerary1.setArrivalLocation("Pittsburgh");
		itinerary1.setArrivalMonth("August");
		itinerary1.setArrivalDay("5");
		itinerary1.setArrivalYear("2020");
		itinerary1.setArrivalTime("3:00");
		
		itinerary2 = new TravelItinerary();
		itinerary2 = new TravelItinerary();
		itinerary2.setNumPassengers(2);
		itinerary2.setOneWayTrip(true);
		itinerary2.setRoundTrip(true);
		itinerary2.setDepartureLocation("Denver");
		itinerary2.setDepartureMonth("July");
		itinerary2.setDepartureDay("30");
		itinerary2.setDepartureYear("2020");
		itinerary2.setDepartureTime("10:00");
		itinerary2.setArrivalLocation("Pittsburgh");
		itinerary2.setArrivalMonth("August");
		itinerary2.setArrivalDay("5");
		itinerary2.setArrivalYear("2020");
		itinerary2.setArrivalTime("3:00");
		
		itinerary3 = new TravelItinerary();
		itinerary3.setNumPassengers(1);
		itinerary3.setOneWayTrip(true);
		itinerary3.setRoundTrip(true);
		itinerary3.setDepartureLocation("Denver");
		itinerary3.setDepartureMonth("July");
		itinerary3.setDepartureDay("30");
		itinerary3.setDepartureYear("2020");
		itinerary3.setDepartureTime("10:00");
		itinerary3.setArrivalLocation("Pittsburgh");
		itinerary3.setArrivalMonth("August");
		itinerary3.setArrivalDay("5");
		itinerary3.setArrivalYear("2020");
		itinerary3.setArrivalTime("3:00");
		
		itinerary4 = new TravelItinerary();
	}

	// Test method that validates that all travel itinerary input is valid
	@Test
	public final void testValidateTravelItinerary() {
		assertTrue ("flight validates", itinerary1.validate());
	}
	
	// Test method does not validates because none of the parameters are passed
	@Test
	public final void testNotValidateTravelItinerary() {
		assertFalse ("flight does not validate", itinerary4.validate());
	}
	
	// Test method that checks if two itinerary variables hold identical values
	@Test
	public final void testEqualsTravelItinerary() {
		assertTrue ("itinerary1 equals itinerary2", itinerary1.equals(itinerary2));
		}
	
	// Test method that checks if two itinerary variables do not hold identical values
	@Test
	public final void testNotEqualsTravelItinerary() {
		assertFalse ("itinerary1 equals itinerary2", itinerary1.equals(itinerary3));
		}

}
