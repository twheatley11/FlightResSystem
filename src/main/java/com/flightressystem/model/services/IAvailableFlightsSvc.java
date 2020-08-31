package com.flightressystem.model.services;

import com.flightressystem.model.domain.AvailableFlights;


import com.flightressystem.model.domain.Flight;
import com.flightressystem.model.domain.TravelItinerary;
import com.flightressystem.model.exceptions.AvailableFlightsNotFoundException;

/**
 * @author Tasha Wheatley
 * @since 3/28/20
 */

public interface IAvailableFlightsSvc extends IService{
	
	public final String NAME = "IAvailableFlightsSvc";
	
	public void storeAvailableFlights(AvailableFlights availableFlights) throws AvailableFlightsNotFoundException;
	public AvailableFlights getAvailableFlights (Flight flight, TravelItinerary itinerary);

}
