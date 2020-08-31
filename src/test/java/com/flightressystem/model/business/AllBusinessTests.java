package com.flightressystem.model.business;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AirlineMgrTest.class, AvailableFlightsMgrTest.class, CreditCardMgrTest.class,
		CustomerLoginMgrTest.class, CustomerMgrTest.class, FlightMgrTest.class, TravelItineraryMgrTest.class,
		TravelReservationMgrTest.class })
public class AllBusinessTests {

}
