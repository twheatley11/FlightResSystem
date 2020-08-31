package com.flightressystem.model.services;

import com.flightressystem.model.domain.TravelReservation;
import com.flightressystem.model.exceptions.InvalidReservationException;

/**
 * @author Tasha Wheatley
 * @since 3/28/20
 */

public interface ITravelReservationSvc extends IService{
	
	public final String NAME = "ITravelReservationSvc";

	public void storeTravelReservation(TravelReservation res)throws InvalidReservationException;
	public TravelReservation getTravelReservation (int id);

}
