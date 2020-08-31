package com.flightressystem.model.domain;

import static org.junit.Assert.*;



import org.junit.Before;
import org.junit.Test;

public class TravelReservationTest {
	private TravelReservation reservation1, reservation2, reservation3;
	private Customer customer1, customer2;
	private TravelItinerary travelItinerary1;
	private AvailableFlights availableFlights;
	private Flight flight1;

	@Before
	public void setUp() throws Exception {
		
		customer1 = new Customer();
		customer1.setLastName("Wheatley");
		customer1.setFirstName("Tasha");
		customer1.setUserName("twheatley");
		customer1.setPassword("12345");
		customer1.setEmailAddress("twheatley@regis.edu");
		customer1.setAddress("1234 Main Street");
		customer1.setCity("Denver");
		customer1.setState("Colorado");
		customer1.setZipCode(12345);
		customer1.setCustID(11111);
		
		customer2 = new Customer();
		customer2.setLastName("Gorney");
		customer2.setFirstName("Tanisha");
		customer2.setUserName("twheatley");
		customer2.setPassword("12345");
		customer2.setEmailAddress("twheatley@regis.edu");
		customer2.setAddress("1234 Main Street");
		customer2.setCity("Denver");
		customer2.setState("Colorado");
		customer2.setZipCode(12345);
		customer2.setCustID(11111);
		
		reservation1 = new TravelReservation();
		reservation1.setCustomer(customer1);
		reservation1.setTravelItinerary(travelItinerary1);
		reservation1.setAvailableFlights(availableFlights);
		reservation1.setFlight(flight1);
		
		reservation2 = new TravelReservation();
		reservation2.setCustomer(customer1);
		reservation2.setTravelItinerary(travelItinerary1);
		reservation2.setAvailableFlights(availableFlights);
		reservation2.setFlight(flight1);
		
		reservation3 = new TravelReservation();
		reservation3.setCustomer(customer2);
		reservation3.setTravelItinerary(travelItinerary1);
		reservation3.setAvailableFlights(availableFlights);
		reservation3.setFlight(flight1);
	}

	// Test method that checks if two reservation variables hold identical values
	@Test
	public final void testEqualsTravelReservation() {
		assertTrue ("reservation1 equals reservatione2", reservation1.equals(reservation2));
		}
	
	// Test method that checks if two reservation variables do not hold identical values
		@Test
		public final void testNotEqualsTravelReservation() {
		assertFalse ("reservation1 equals reservation3", reservation1.equals(reservation3));
			}
	
}
