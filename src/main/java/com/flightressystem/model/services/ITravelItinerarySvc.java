package com.flightressystem.model.services;

import com.flightressystem.model.domain.TravelItinerary;
import com.flightressystem.model.exceptions.InvalidItineraryException;

/**
 * @author Tasha Wheatley
 * @since 3/28/20
 */

public interface ITravelItinerarySvc extends IService{
	
	public final String NAME = "ITravelItinerarySvc";
	
	public void storeTravelItinerary(TravelItinerary res) throws InvalidItineraryException;
	public TravelItinerary getTravelItinerary (int id);

}
