package com.flightressystem.model.services;

import com.flightressystem.model.domain.Flight;
import com.flightressystem.model.domain.TravelItinerary;
import com.flightressystem.model.exceptions.InvalidFlightException;

/**
 * @author Tasha Wheatley
 * @since 3/28/20
 */

public interface IFlightSvc extends IService{
	
	public final String NAME = "IFlightSvc";
	
	public void storeFlight(Flight flight) throws InvalidFlightException;
	public Flight getFlight(TravelItinerary itinerary);

}
