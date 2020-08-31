package com.flightressystem.model.services;

import com.flightressystem.model.domain.CreditCard;
import com.flightressystem.model.exceptions.InvalidCreditCardException;

/**
 * @author Tasha Wheatley
 * @since 3/28/20
 */

public interface ICreditCardSvc extends IService{
	
	public final String NAME = "ICreditCardSvc";
	
	public void storeCreditCard(CreditCard res) throws InvalidCreditCardException;
	public CreditCard getCreditCard (int id);
}
