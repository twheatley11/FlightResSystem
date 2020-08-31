package com.flightressystem.model.domain;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AirlineTest.class, AvailableFlightsTest.class, CreditCardTest.class, CustomerLoginTest.class,
		CustomerTest.class, FlightTest.class, TravelItineraryTest.class, TravelReservationTest.class })
public class AllDomainTests {

}
