package com.flightressystem.model.business;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.flightressystem.model.domain.Airline;
import com.flightressystem.model.exceptions.InvalidAirlineException;
import com.flightressystem.model.exceptions.ServiceLoadException;
import com.flightressystem.model.services.IAirlineSvc;
import com.flightressystem.model.services.factory.ServicesFactory;

/**
 * @author Tasha Wheatley
 * @since 4/10/20
 */

public class AirlineMgr extends Manager{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");

	private static Airline Airline; 
	
	public AirlineMgr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean create(Airline airline) throws ServiceLoadException, InvalidAirlineException{
		IAirlineSvc iairlinesvc;
		boolean action = false;
		try {
			logger.info("Entering method AirlineMgr: create");	
			ServicesFactory servicesFactory = ServicesFactory.getInstance();
			iairlinesvc = (IAirlineSvc) servicesFactory.getService(IAirlineSvc.NAME);
			iairlinesvc.storeAirline(airline);
			action = true;
		}
		catch (ServiceLoadException e1) {
			logger.error("AirlineMgr: create - ServiceLoadException", e1);
			}
		catch (InvalidAirlineException e2) {
			logger.error("AirlineMgr: create - Invalid length of credit card number or expiration date", e2);
			}
		catch (NullPointerException e3) {
			logger.error("AirlineMgr: create - NullPointerException when reading customer object", e3);
			}
		catch (Exception e4) {
			logger.error("AirlineMgr: create - Unexpected Exception Found", e4);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
		}
		return action;
	}
	
	public Airline get(int id) throws ServiceLoadException, InvalidAirlineException{
		IAirlineSvc iairlinesvc; 
		try {
			logger.info("Entering method AirlineMgr: get");
			ServicesFactory servicesFactory = ServicesFactory.getInstance();
			iairlinesvc = (IAirlineSvc) servicesFactory.getService(IAirlineSvc.NAME);
			iairlinesvc.getAirline(id);
			}
		catch (ServiceLoadException e1) {
			logger.error("AirlineMgr: get - ServiceLoadException", e1);
			}
		catch (NullPointerException e2) {
			logger.error("AirlineMgr: get - NullPointerException when reading customer object", e2);
			}
		catch (Exception e3) {
			logger.error("AirlineMgr: get - Unexpected Exception Found", e3);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
		}
		return Airline; 
	}
	
	public boolean  update(Airline airline) throws ServiceLoadException, InvalidAirlineException{
		logger.info("Entering method AirlineMgr: update");
		return true;
	}
	
	public boolean delete(Airline airline) throws ServiceLoadException, InvalidAirlineException{
		logger.info("Entering method AirlineMgr: delete");
		return true;
		
	}
}
