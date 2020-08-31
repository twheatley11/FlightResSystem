 package com.flightressystem.model.services;

import com.flightressystem.model.domain.TravelReservation;

import com.flightressystem.model.exceptions.LoginNotFoundException;

/**
 * @author Tasha Wheatley
 * @since 3/28/20
 */

public interface ICustomerLoginSvc extends IService{
	
	public final String NAME = "ICustomerLoginSvc";
	
	public boolean authenticateCustomerLogin(TravelReservation travelReservation) throws LoginNotFoundException;
	
}
