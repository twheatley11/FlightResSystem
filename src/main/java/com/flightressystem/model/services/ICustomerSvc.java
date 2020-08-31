package com.flightressystem.model.services;

import com.flightressystem.model.domain.Customer;

import com.flightressystem.model.exceptions.InvalidCustomerException;

/**
 * @author Tasha Wheatley
 * @since 3/28/20
 */

public interface ICustomerSvc extends IService{
	
	public final String NAME = "ICustomerSvc";
	
	public void storeCustomer(Customer cust) throws InvalidCustomerException;
	public Customer getCustomer (String username);
	
}
