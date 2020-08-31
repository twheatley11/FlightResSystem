package com.flightressystem.model.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author Tasha Wheatley
 * @since 3/21/20
 */

public class Airline implements Serializable{
	
	/*Domain Airline class that holds all information about the airline including
	 * airline name, airline code, and a list of flights
	 */
	
	private static final long serialVersionUID = 1L; //Universal version identifier for a Serializable class.
	
	private String airlineName;        //Name of the airline
	 
	private String airlineCode;        //two-letter airline code
	 
	List<Flight> flightList;	       //Used to store a list of flight elements(objects) 
	
	private AvailableFlights availableFlights;  

	public boolean validate() {
		if (airlineName == null)
			return false;
		if (airlineCode == null)
			return false;
		if (flightList == null)
			return false;
		

		return true;
	}
	
	
	public Airline() {
		super();
	}

	
	/**
	 * @return the airlineName
	 */
	public String getAirlineName() {
		return airlineName;
	}


	/**
	 * @param airlineName the airlineName to set
	 */
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}


	/**
	 * @return the airlineCode
	 */
	public String getAirlineCode() {
		return airlineCode;
	}


	/**
	 * @param airlineCode the airlineCode to set
	 */
	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}


	/**
	 * @return the flightList
	 */
	public List<Flight> getFlightList() {
		return flightList;
	}


	/**
	 * @param flightList the flightList to set
	 */
	public void setFlightList(List<Flight> flightList) {
		this.flightList = flightList;
	}


	/**
	 * @return the availableFlights
	 */
	public AvailableFlights getAvailableFlights() {
		return availableFlights;
	}


	/**
	 * @param availableFlights the availableFlights to set
	 */
	public void setAvailableFlights(AvailableFlights availableFlights) {
		this.availableFlights = availableFlights;
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
		result = prime * result + ((airlineCode == null) ? 0 : airlineCode.hashCode());
		result = prime * result + ((airlineName == null) ? 0 : airlineName.hashCode());
		result = prime * result + ((availableFlights == null) ? 0 : availableFlights.hashCode());
		result = prime * result + ((flightList == null) ? 0 : flightList.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Airline))
			return false;
		Airline other = (Airline) obj;
		if (airlineCode == null) {
			if (other.airlineCode != null)
				return false;
		} else if (!airlineCode.equals(other.airlineCode))
			return false;
		if (airlineName == null) {
			if (other.airlineName != null)
				return false;
		} else if (!airlineName.equals(other.airlineName))
			return false;
		if (availableFlights == null) {
			if (other.availableFlights != null)
				return false;
		} else if (!availableFlights.equals(other.availableFlights))
			return false;
		if (flightList == null) {
			if (other.flightList != null)
				return false;
		} else if (!flightList.equals(other.flightList))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Airline [airlineName=" + airlineName + ", airlineCode=" + airlineCode + ", flightList=" + flightList
				+ ", availableFlights=" + availableFlights + "]";
	}


	
	
}
