package com.flightressystem.model.services.factory;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.flightressystem.model.exceptions.ServiceLoadException;
import com.flightressystem.model.services.*;


/**
 * @author Tasha Wheatley
 * @since 3/28/20
 * 
 * Tests for all of the factory services to check that they are returning the correct instance
 */

public class ServicesFactoryTest{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");

	ServicesFactory servicesFactory;
	
	@Before
	public void setUp() throws Exception {
		servicesFactory = ServicesFactory.getInstance(); 
	}
	
	
	/**
     * This test returns airlineSvc and makes an assertion by 
     * checking if it is an instance of AirlineSvcImpl
     * 
     * This should be true since AirlineSvcImpl implements IAirlineSvc
     */
	@Test	
	public void testGetAirlineSvc() {
		try {
 		IAirlineSvc airlineSvc; 
 		airlineSvc = (IAirlineSvc)servicesFactory.getService(IAirlineSvc.NAME);
  	    assertTrue(airlineSvc instanceof AirlineSvcImpl);
  	    }
		catch (ServiceLoadException e) {
			logger.error("ServiceLoadException");
			}
  	    
  		}
	

	/**
     * This test returns availFlightsSvc and makes an assertion by 
     * checking if it is an instance of AvailableFlightsSvcImpl
     * 
     * This should be true since AvailableFlightsSvcImpl implements IAvailableFlightsSvc
     */
	@Test	
	public void testGetAvailavleFlightsSvc() {
		try {
 		IAvailableFlightsSvc availFlightsSvc; 
 		availFlightsSvc = (IAvailableFlightsSvc)servicesFactory.getService(IAvailableFlightsSvc.NAME);
  	    assertTrue(availFlightsSvc instanceof AvailableFlightsSvcImpl);
		}
		catch (ServiceLoadException e) {
			logger.error("ServiceLoadException");
			}
 	}
	
	
	/**
     * This test returns creditCardSvc and makes an assertion by 
     * checking if it is an instance of CreditCardSvcImpl
     * 
     * This should be true since CreditCardSvcImpl implements ICreditCardSvc
     */
	@Test	
	public void testGetCreditCardSvc() {
		try {
 		ICreditCardSvc creditCardSvc; 
 		creditCardSvc = (ICreditCardSvc)servicesFactory.getService(ICreditCardSvc.NAME);
  	    assertTrue(creditCardSvc instanceof CreditCardSvcImpl);
		}
		catch (ServiceLoadException e) {
			logger.error("ServiceLoadException");
			}
	}
	
	
	/**
     * This test returns custLoginSvc and makes an assertion by 
     * checking if it is an instance of CustomerLoginSvcImpl
     * 
     * This should be true since CustomerLoginSvcImpl implements ICustomerLoginSvc
     */
	@Test	
	public void testGetCustomerLoginSvc() {
		try {
 		ICustomerLoginSvc custLoginSvc; 
 		custLoginSvc = (ICustomerLoginSvc)servicesFactory.getService(ICustomerLoginSvc.NAME);
  	    assertTrue(custLoginSvc instanceof CustomerLoginSvcImpl); 
		}
		catch (ServiceLoadException e) {
			logger.error("ServiceLoadException");
			}
	}
	
	
	/**
     * This test returns custSvc and makes an assertion by 
     * checking if it is an instance of CustomerSvcImpl
     * 
     * This should be true since CustomerSvcImpl implements ICustomerSvc
     */
	@Test	
	public void testGetCustomerSvc() {
		try {
 		ICustomerSvc custSvc; 
 		custSvc = (ICustomerSvc)servicesFactory.getService(ICustomerSvc.NAME);
  	    assertTrue(custSvc instanceof CustomerSvcImpl);
		}
		catch (ServiceLoadException e) {
			logger.error("ServiceLoadException");
			}
	}

	
	/**
     * This test returns flightSvc and makes an assertion by 
     * checking if it is an instance of FlightSvcImpl
     * 
     * This should be true since FlightSvcImpl implements IFlightSvcSvc
     */
	@Test	
	public void testGetFlightSvc() {
		try {
 		IFlightSvc flightSvc; 
 		flightSvc = (IFlightSvc)servicesFactory.getService(IFlightSvc.NAME);
  	    assertTrue(flightSvc instanceof FlightSvcImpl);  
		}
		catch (ServiceLoadException e) {
			logger.error("ServiceLoadException");
			}
	}
	
	
	/**
     * This test returns travItinSvc and makes an assertion by 
     * checking if it is an instance of TravelItinerarySvcImpl
     * 
     * This should be true since TravelItinerarySvcImpl implements ITravelItinerarySvcSvc
     */
	@Test	
	public void testGetTravelItinerarySvc() {
		try {
 		ITravelItinerarySvc travItinSvc; 
 		travItinSvc = (ITravelItinerarySvc)servicesFactory.getService(ITravelItinerarySvc.NAME);
  	    assertTrue(travItinSvc instanceof TravelItinerarySvcImpl); 
		}
		catch (ServiceLoadException e) {
			logger.error("ServiceLoadException");
			}
		}
	

	/**
     * This test returns travResSvc and makes an assertion by 
     * checking if it is an instance of TravelReservationSvcImpl
     * 
     * This should be true since TravelReservationSvcImpl implements ITravelReservationSvcSvc
     */
	@Test	
	public void testGetTravelReservationSvc() {
		try {
 		ITravelReservationSvc travResSvc; 
 		travResSvc = (ITravelReservationSvc)servicesFactory.getService(ITravelReservationSvc.NAME);
  	    assertTrue(travResSvc instanceof TravelReservationSvcImpl); 
		}
		catch (ServiceLoadException e) {
			logger.error("ServiceLoadException");
			}
	}


}
