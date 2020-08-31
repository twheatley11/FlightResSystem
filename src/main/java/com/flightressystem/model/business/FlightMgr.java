package com.flightressystem.model.business;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.flightressystem.model.domain.Flight;
import com.flightressystem.model.domain.TravelItinerary;
import com.flightressystem.model.exceptions.InvalidFlightException;
import com.flightressystem.model.exceptions.ServiceLoadException;
import com.flightressystem.model.services.IFlightSvc;
import com.flightressystem.model.services.factory.ServicesFactory;

/**
 * @author Tasha Wheatley
 * @since 4/10/20
 */

public class FlightMgr extends Manager{
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");

	private static Flight Flight;
	
	public FlightMgr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean create(Flight flight) throws ServiceLoadException, InvalidFlightException{
		IFlightSvc iflightsvc; 
		boolean action = false;
		try {
			logger.info("Entering method FlightMgr: create");
			ServicesFactory servicesFactory = ServicesFactory.getInstance();
			iflightsvc = (IFlightSvc) servicesFactory.getService(IFlightSvc.NAME);
			iflightsvc.storeFlight(flight);
			action = true; 
			}
		catch (ServiceLoadException e1) {
			logger.error("FlightMgr: create - ServiceLoadException", e1);
			}
		catch (InvalidFlightException e2) {
			logger.error("FlightMgr: create - InvalidFlightException", e2);
			}
		catch (NullPointerException e3) {
			logger.error("FlightMgr: create - NullPointerException when reading customer object", e3);
			}
		catch (Exception e4) {
			logger.error("FlightMgr: create - Unexpected Exception Found", e4);
		}
		finally {
			//finally block of code is where you put code that must run regardless if there is an exception
			logger.trace("Finally block");
			}
			return action;
		}
		
		public Flight get(TravelItinerary itinerary)  throws ServiceLoadException, InvalidFlightException{
			IFlightSvc iflightsvc; 
			try {
				logger.info("Entering method FlightMgr: get");
				ServicesFactory servicesFactory = ServicesFactory.getInstance();
				iflightsvc = (IFlightSvc) servicesFactory.getService(IFlightSvc.NAME);
				iflightsvc.getFlight(itinerary);
				}
			catch (ServiceLoadException e1) {
				logger.error("FlightMgr: get - ServiceLoadException", e1);
				}
			catch (NullPointerException e2) {
				logger.error("FlightMgr: get - NullPointerException when reading customer object", e2);
				}
			catch (Exception e3) {
				logger.error("FlightMgr: get - Unexpected Exception Found", e3);
			}
			finally {
				//finally block of code is where you put code that must run regardless if there is an exception
				logger.trace("Finally block");
				}
			return Flight; 
		}
		
		public boolean update(Flight flight)  throws ServiceLoadException, InvalidFlightException{
			logger.info("Entering method FlightMgr: update");
			return true;
		}
		
		public boolean delete(Flight flight)  throws ServiceLoadException, InvalidFlightException{
			logger.info("Entering method FlightMgr: delete");
			return true;
		}
	}
