package com.flightressystem.model.services;

import org.junit.runner.RunWith;

import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import com.flightressystem.model.services.factory.*;

@RunWith(Suite.class)
@SuiteClasses({ IAirlineSvcTest.class, IAvailableFlightsSvcTest.class, ICreditCardSvcTest.class, ICustomerLoginSvcTest.class, ICustomerSvcTest.class,
		IFlightSvcTest.class, ITravelItinerarySvcTest.class, ITravelReservationSvcTest.class, ServicesFactoryTest.class})
public class AllServicesTests {

}
