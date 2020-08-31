package com.flightressystem.model.business;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.flightressystem.model.domain.TravelReservation;
import com.flightressystem.model.exceptions.InvalidReservationException;
import com.flightressystem.model.exceptions.ServiceLoadException;
import com.flightressystem.model.services.ITravelReservationSvc;
import com.flightressystem.model.services.factory.ServicesFactory;

/**
 * @author Tasha Wheatley
 * @since 4/10/20
 */

public class TravelReservationMgr extends Manager{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");

	private static TravelReservation TravelReservation;
	
	public TravelReservationMgr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean create(TravelReservation travelReservation) throws ServiceLoadException, InvalidReservationException{
		ITravelReservationSvc itravelressvc; 
		boolean action = false;
		try {
			logger.info("Entering method TravelReservationMgr: create");
			ServicesFactory servicesFactory = ServicesFactory.getInstance();
			itravelressvc = (ITravelReservationSvc) servicesFactory.getService(ITravelReservationSvc.NAME);
			itravelressvc.storeTravelReservation(travelReservation);
			action = true;
			}
		catch (ServiceLoadException e1) {
			logger.error("TravelReservationMgr: create - ServiceLoadException", e1);
			}
		catch (InvalidReservationException e2) {
			logger.error("TravelReservationMgr: create - InvalidReservationException", e2);
		}
		catch (NullPointerException e3) {
			logger.error("TravelReservationMgr: create - NullPointerException when reading customer object", e3);
			}
		catch (Exception e4) {
			logger.error("TravelReservationMgr: create - Unexpected Exception Found", e4);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		return action; 
	}
	
	public TravelReservation get(int id)  throws ServiceLoadException, InvalidReservationException{
		ITravelReservationSvc itravelressvc; 
		try {
			logger.info("Entering method TravelReservationMgr: get");
			ServicesFactory servicesFactory = ServicesFactory.getInstance();
			itravelressvc = (ITravelReservationSvc) servicesFactory.getService(ITravelReservationSvc.NAME);
			itravelressvc.getTravelReservation(id);
			}
		catch (ServiceLoadException e1) {
			logger.error("TravelReservationMgr: get - ServiceLoadException", e1);
			}
		catch (NullPointerException e2) {
			logger.error("TravelReservationMgr: get - NullPointerException when reading customer object", e2);
			}
		catch (Exception e3) {
			logger.error("TravelReservationMgr: get - Unexpected Exception Found", e3);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
		return TravelReservation; 
	}
	
	public boolean update(TravelReservation travelReservation) throws ServiceLoadException, InvalidReservationException{
		logger.info("Entering method TravelReservationMgr: update");
		return true; 
	}
	
	public boolean delete(TravelReservation travelReservation) throws ServiceLoadException, InvalidReservationException{
		logger.info("Entering method TravelReservationMgr: delete");
		return true; 
	}
}
