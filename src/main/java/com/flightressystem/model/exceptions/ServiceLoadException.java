package com.flightressystem.model.exceptions;

/**
 * @author Tasha Wheatley
 * @since 4/4/20
 */

public class ServiceLoadException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public ServiceLoadException (String s) {
		 super(s); // call base class constructor
		 s = "Invalid Service";
		 }

}
