package com.flightressystem.model.services.factory;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.flightressystem.model.exceptions.ServiceLoadException;
import com.flightressystem.model.services.IService;

/**
 * @author Tasha Wheatley
 * @since 3/28/20
 * 
 * Simplistic version of the services factory.
 * 
 * The Factory now requires that all services be requested by name and extend
 * the base interface IService
 */

public class ServicesFactory {
	
	private ServicesFactory() {}
	
	private static ServicesFactory serviceFactory = new ServicesFactory();
	
	public static ServicesFactory getInstance() {return serviceFactory;}
	
	// use a named logger instead of the root logger
	static private Logger logger = LogManager.getLogger("com.flightressystem");

	@SuppressWarnings("deprecation")
	public IService getService(String serviceName) throws ServiceLoadException {
		try
		{
			Class<?> c = Class.forName(getImplName(serviceName));
			logger.info("Entering ServicesFactory: " + (IService)c.newInstance());
			return (IService)c.newInstance();
			} 
		catch (Exception e)
		{
			throw new ServiceLoadException(serviceName + "not loaded");
			}
		}


	
	private String getImplName (String serviceName) throws Exception {
	 java.util.Properties props = new java.util.Properties();
	 java.io.FileInputStream fis = new java.io.FileInputStream("C:\\Users\\tnwhe\\eclipse-workspace\\FlightResSystem\\src\\main\\resources\\application.properties");
	 props.load(fis);
	 fis.close();
	 return props.getProperty(serviceName);
	}
	
	
	
		
}
