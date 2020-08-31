package com.flightressystem.model.services;

import com.flightressystem.model.domain.Airline;
import com.flightressystem.model.exceptions.InvalidAirlineException;

/**
 * @author Tasha Wheatley
 * @since 3/28/20
 */

public interface IAirlineSvc extends IService{
	
	public final String NAME = "IAirlineSvc";
	
	public void storeAirline(Airline airline) throws InvalidAirlineException;
	public Airline getAirline (int id);

}
