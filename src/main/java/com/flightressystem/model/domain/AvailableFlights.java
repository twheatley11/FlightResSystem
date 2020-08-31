package com.flightressystem.model.domain;

import java.io.Serializable;

import java.util.ArrayList;

/**
 * @author Tasha Wheatley
 * @since 3/21/20
 */

public class AvailableFlights implements Serializable{
	
	/*Domain AvailableFlights class that holds information about whether there are seats 
	 * available on that flight
	 */
	
	
	private static final long serialVersionUID = 1L;  //Universal version identifier for a Serializable class. 
	
	private boolean flightAvailable;    //Shows if there are seats available on that flight

	private ArrayList<Flight> availableFlightsList = new ArrayList<Flight>(1); //Holds flight objects

	
	public boolean validate() {
		if (flightAvailable == false)
			return false;
		if (availableFlightsList == null)
			return false;
		
		return true;
	}
	
	public AvailableFlights() {
		super();
	}

	
	/**
	 * @return the flightAvailable
	 */
	public boolean isFlightAvailable() {
		return flightAvailable;
	}

	/**
	 * @param flightAvailable the flightAvailable to set
	 */
	public void setFlightAvailable(boolean flightAvailable) {
		this.flightAvailable = flightAvailable;
	}

	/**
	 * @return the availableFlightsList
	 */
	public ArrayList<Flight> getAvailableFlightsList() {
		return availableFlightsList;
	}

	/**
	 * @param availableFlightsList the availableFlightsList to set
	 */
	public void setAvailableFlightsList(ArrayList<Flight> availableFlightsList) {
		this.availableFlightsList = availableFlightsList;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((availableFlightsList == null) ? 0 : availableFlightsList.hashCode());
		result = prime * result + (flightAvailable ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof AvailableFlights))
			return false;
		AvailableFlights other = (AvailableFlights) obj;
		if (availableFlightsList == null) {
			if (other.availableFlightsList != null)
				return false;
		} else if (!availableFlightsList.equals(other.availableFlightsList))
			return false;
		if (flightAvailable != other.flightAvailable)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AvailableFlights [flightAvailable=" + flightAvailable + ", availableFlightsList=" + availableFlightsList
				+ "]";
	}

	
}
