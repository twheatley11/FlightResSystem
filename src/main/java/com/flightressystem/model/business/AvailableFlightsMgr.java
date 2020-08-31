package com.flightressystem.model.business;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.flightressystem.model.domain.AvailableFlights;
import com.flightressystem.model.domain.Flight;
import com.flightressystem.model.domain.TravelItinerary;
import com.flightressystem.model.exceptions.AvailableFlightsNotFoundException;
import com.flightressystem.model.exceptions.ServiceLoadException;
import com.flightressystem.model.services.IAvailableFlightsSvc;
import com.flightressystem.model.services.factory.ServicesFactory;

/**
 * @author Tasha Wheatley
 * @since 4/10/20
 */

public class AvailableFlightsMgr extends Manager{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");
	
	public static AvailableFlights AvailableFlights; 

	public AvailableFlightsMgr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean create(AvailableFlights availFlights) throws ServiceLoadException, AvailableFlightsNotFoundException{
		IAvailableFlightsSvc iavailflightsvc; 
		boolean action = false;
		try {
			logger.info("Entering method AvailableFlightsMgr: create");
			ServicesFactory servicesFactory = ServicesFactory.getInstance();
			iavailflightsvc = (IAvailableFlightsSvc) servicesFactory.getService(IAvailableFlightsSvc.NAME);
			iavailflightsvc.storeAvailableFlights(availFlights);
			action = true;
			}
		catch (ArrayIndexOutOfBoundsException e1) {
			logger.error("AvailableFlightsMgr: create - ArrayIndexOutOfBoundsException", e1);
			}
		catch (ServiceLoadException e2) {
			logger.error("AvailableFlightsMgr: create - ServiceLoadException", e2);
			}
		catch (AvailableFlightsNotFoundException e3) {
			logger.error("AvailableFlightsMgr: create - ServiceLoadException", e3);
			}
	
		catch (NullPointerException e4) {
			logger.error("AvailableFlightsMgr: create - NullPointerException when reading customer object", e4);
			}
		catch (Exception e5) {
			logger.error("AvailableFlightsMgr: create - Unexpected Exception Found", e5);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		return action;
	}
	
	public AvailableFlights get(Flight flight, TravelItinerary itinerary) throws ServiceLoadException, AvailableFlightsNotFoundException{
		IAvailableFlightsSvc iavailflightsvc; 
		try {
			logger.info("Entering method AvailableFlightsMgr: get");
			ServicesFactory servicesFactory = ServicesFactory.getInstance();
			iavailflightsvc = (IAvailableFlightsSvc) servicesFactory.getService(IAvailableFlightsSvc.NAME);
			iavailflightsvc.getAvailableFlights(flight, itinerary);
			}
		catch (ServiceLoadException e1) {
			logger.error("AvailableFlightsMgr: get - ServiceLoadException", e1);
			}
		catch (ArrayIndexOutOfBoundsException e2) {
			logger.error("AvailableFlightsMgr: get - ArrayIndexOutOfBoundsException", e2);
			}
		catch (NullPointerException e3) {
			logger.error("AvailableFlightsMgr: get - NullPointerException when reading customer object", e3);
			}
		catch (Exception e4) {
			logger.error("AvailableFlightsMgr: get - Unexpected Exception Found", e4);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		return AvailableFlights; 
	}
	
	public boolean update(AvailableFlights availFlights) throws ServiceLoadException, AvailableFlightsNotFoundException{
		logger.info("Entering method AvailableFlightsMgr: update");
		return true;
	}
	
	public boolean delete(AvailableFlights availFlights) throws ServiceLoadException, AvailableFlightsNotFoundException{
		logger.info("Entering method AvailableFlightsMgr: delete");
		return true;
	}
}
