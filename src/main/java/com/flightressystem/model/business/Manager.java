package com.flightressystem.model.business;

import com.flightressystem.model.exceptions.ServiceLoadException;
import com.flightressystem.model.services.IService;
import com.flightressystem.model.services.factory.ServicesFactory;

public abstract class Manager {
	
	private ServicesFactory servicesFactory = ServicesFactory.getInstance();
	protected IService getService(String name) throws ServiceLoadException
	{
	 return servicesFactory.getService(name);
	}

}
