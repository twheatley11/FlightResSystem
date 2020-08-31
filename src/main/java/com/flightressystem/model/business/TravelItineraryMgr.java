package com.flightressystem.model.business;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.flightressystem.model.domain.TravelItinerary;

import com.flightressystem.model.exceptions.InvalidItineraryException;
import com.flightressystem.model.exceptions.ServiceLoadException;
import com.flightressystem.model.services.ITravelItinerarySvc;
import com.flightressystem.model.services.factory.ServicesFactory;

/**
 * @author Tasha Wheatley
 * @since 4/10/20
 */

public class TravelItineraryMgr extends Manager{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");
	
	private static TravelItinerary TravelItinerary;

	public TravelItineraryMgr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean create(TravelItinerary travelItinerary) throws ServiceLoadException, InvalidItineraryException{
		ITravelItinerarySvc itravelitinsvc;
		boolean action = false;
		try {
			logger.info("Entering method TravelItineraryMgr: create");
			ServicesFactory servicesFactory = ServicesFactory.getInstance();
			itravelitinsvc = (ITravelItinerarySvc) servicesFactory.getService(ITravelItinerarySvc.NAME);
			itravelitinsvc.storeTravelItinerary(travelItinerary);
			action = true;
			}
		catch (ServiceLoadException e1) {
			logger.error("TravelItineraryMgr: create - ServiceLoadException", e1);
			}
		catch (InvalidItineraryException e2) {
			logger.error("TravelItineraryMgr: create - InvalidItineraryException", e2);
		}
		catch (NullPointerException e3) {
			logger.error("TravelItineraryMgr: create - NullPointerException when reading customer object", e3);
			}
		catch (Exception e4) {
			logger.error("TravelItineraryMgr: create - Unexpected Exception Found", e4);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		
		return action; 
	}
	
	public TravelItinerary get(int id) throws ServiceLoadException, InvalidItineraryException{
		ITravelItinerarySvc itravelitinsvc; 
		try {
			logger.info("Entering method TravelItineraryMgr: get");
			ServicesFactory servicesFactory = ServicesFactory.getInstance();
			itravelitinsvc = (ITravelItinerarySvc) servicesFactory.getService(ITravelItinerarySvc.NAME);
			itravelitinsvc.getTravelItinerary(id);
			}
		catch (ServiceLoadException e1) {
			logger.error("TravelItineraryMgr: get - ServiceLoadException", e1);
			}
		catch (NullPointerException e2) {
			logger.error("TravelItineraryMgr: get - NullPointerException when reading customer object", e2);
			}
		catch (Exception e3) {
			logger.error("TravelItineraryMgr: get - Unexpected Exception Found", e3);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		return TravelItinerary; 
	}
	
	public boolean update(TravelItinerary travelItinerary) throws ServiceLoadException, InvalidItineraryException{
		logger.info("Entering method TravelItineraryMgr: update");
		return true;
	}
	
	public boolean delete(TravelItinerary travelItinerary) throws ServiceLoadException, InvalidItineraryException{
		logger.info("Entering method TravelItineraryMgr: delete");
		return true;
	}
	
	
}
