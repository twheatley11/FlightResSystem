package com.flightressystem.model.domain;

import java.io.Serializable;

/**
 * @author Tasha Wheatley
 * @since 3/21/20
 */

public class TravelItinerary implements Serializable{
	
	/*Domain TravelItinerary class that holds all information about the customer's travel itinerary
	 * including number of passengers, type of flight (round trip/one-way), and 
	 * departure/arrival date/time and location
	 */

	
	/*
	 * Universal version identifier for a Serializable class. Deserialization uses this number to ensure 
	 * that a loaded class corresponds exactly to a serialized object. If no match is found, then an 
	 * InvalidClassException is thrown.
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer numPassengers;    //Number of passengers for trip
	private Boolean	oneWayTrip;  	  //Indicate if trip is one-way
	private Boolean roundTrip; 		  //Indicates if trip is round-trip
	
	private String departureLocation; // Location of departure
	private String departureMonth;    //Month of departure
	private String departureDay;      //Day of departure
	private String departureYear;     //Year of departure
	private String departureTime;     //Time of departure
	
	private String arrivalLocation;  //Location of arrival
	private String arrivalMonth;     //Month of arrival
	private String arrivalDay;       //Day of arrival
	private String arrivalYear;      //Year of arrival
	private String arrivalTime;      //Time of arrival

	public boolean validate() {
		if (numPassengers == null)
			return false;
		if (oneWayTrip == false)
			return false;
		if (roundTrip == false)
			return false;
		if (departureLocation == null)
			return false;
		if (departureMonth == null)
			return false;
		if (departureDay == null)
			return false;
		if (departureYear == null)
			return false;
		if (departureTime == null)
			return false;
		if (arrivalLocation == null)
			return false;
		if (arrivalMonth == null)
			return false;
		if (arrivalDay == null)
			return false;
		if (arrivalYear == null)
			return false;
		if (arrivalTime == null)
			return false;	

		return true;
	}
	
	public TravelItinerary() {
		super();
	}


	/**
	 * @return the numPassengers
	 */
	public Integer getNumPassengers() {
		return numPassengers;
	}


	/**
	 * @param numPassengers the numPassengers to set
	 */
	public void setNumPassengers(Integer numPassengers) {
		this.numPassengers = numPassengers;
	}


	/**
	 * @return the oneWayTrip
	 */
	public Boolean getOneWayTrip() {
		return oneWayTrip;
	}


	/**
	 * @param oneWayTrip the oneWayTrip to set
	 */
	public void setOneWayTrip(Boolean oneWayTrip) {
		this.oneWayTrip = oneWayTrip;
	}


	/**
	 * @return the roundTrip
	 */
	public Boolean getRoundTrip() {
		return roundTrip;
	}


	/**
	 * @param roundTrip the roundTrip to set
	 */
	public void setRoundTrip(Boolean roundTrip) {
		this.roundTrip = roundTrip;
	}


	/**
	 * @return the departureLocation
	 */
	public String getDepartureLocation() {
		return departureLocation;
	}


	/**
	 * @param departureLocation the departureLocation to set
	 */
	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}


	/**
	 * @return the departureMonth
	 */
	public String getDepartureMonth() {
		return departureMonth;
	}


	/**
	 * @param departureMonth the departureMonth to set
	 */
	public void setDepartureMonth(String departureMonth) {
		this.departureMonth = departureMonth;
	}


	/**
	 * @return the departureDay
	 */
	public String getDepartureDay() {
		return departureDay;
	}


	/**
	 * @param departureDay the departureDay to set
	 */
	public void setDepartureDay(String departureDay) {
		this.departureDay = departureDay;
	}


	/**
	 * @return the departureYear
	 */
	public String getDepartureYear() {
		return departureYear;
	}


	/**
	 * @param departureYear the departureYear to set
	 */
	public void setDepartureYear(String departureYear) {
		this.departureYear = departureYear;
	}


	/**
	 * @return the departureTime
	 */
	public String getDepartureTime() {
		return departureTime;
	}


	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}


	/**
	 * @return the arrivalLocation
	 */
	public String getArrivalLocation() {
		return arrivalLocation;
	}


	/**
	 * @param arrivalLocation the arrivalLocation to set
	 */
	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}


	/**
	 * @return the arrivalMonth
	 */
	public String getArrivalMonth() {
		return arrivalMonth;
	}


	/**
	 * @param arrivalMonth the arrivalMonth to set
	 */
	public void setArrivalMonth(String arrivalMonth) {
		this.arrivalMonth = arrivalMonth;
	}


	/**
	 * @return the arrivalDay
	 */
	public String getArrivalDay() {
		return arrivalDay;
	}


	/**
	 * @param arrivalDay the arrivalDay to set
	 */
	public void setArrivalDay(String arrivalDay) {
		this.arrivalDay = arrivalDay;
	}


	/**
	 * @return the arrivalYear
	 */
	public String getArrivalYear() {
		return arrivalYear;
	}


	/**
	 * @param arrivalYear the arrivalYear to set
	 */
	public void setArrivalYear(String arrivalYear) {
		this.arrivalYear = arrivalYear;
	}


	/**
	 * @return the arrivalTime
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}


	/**
	 * @param arrivalTime the arrivalTime to set
	 */
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
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
		result = prime * result + ((arrivalDay == null) ? 0 : arrivalDay.hashCode());
		result = prime * result + ((arrivalLocation == null) ? 0 : arrivalLocation.hashCode());
		result = prime * result + ((arrivalMonth == null) ? 0 : arrivalMonth.hashCode());
		result = prime * result + ((arrivalTime == null) ? 0 : arrivalTime.hashCode());
		result = prime * result + ((arrivalYear == null) ? 0 : arrivalYear.hashCode());
		result = prime * result + ((departureDay == null) ? 0 : departureDay.hashCode());
		result = prime * result + ((departureLocation == null) ? 0 : departureLocation.hashCode());
		result = prime * result + ((departureMonth == null) ? 0 : departureMonth.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((departureYear == null) ? 0 : departureYear.hashCode());
		result = prime * result + ((numPassengers == null) ? 0 : numPassengers.hashCode());
		result = prime * result + ((oneWayTrip == null) ? 0 : oneWayTrip.hashCode());
		result = prime * result + ((roundTrip == null) ? 0 : roundTrip.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof TravelItinerary))
			return false;
		TravelItinerary other = (TravelItinerary) obj;
		if (arrivalDay == null) {
			if (other.arrivalDay != null)
				return false;
		} else if (!arrivalDay.equals(other.arrivalDay))
			return false;
		if (arrivalLocation == null) {
			if (other.arrivalLocation != null)
				return false;
		} else if (!arrivalLocation.equals(other.arrivalLocation))
			return false;
		if (arrivalMonth == null) {
			if (other.arrivalMonth != null)
				return false;
		} else if (!arrivalMonth.equals(other.arrivalMonth))
			return false;
		if (arrivalTime == null) {
			if (other.arrivalTime != null)
				return false;
		} else if (!arrivalTime.equals(other.arrivalTime))
			return false;
		if (arrivalYear == null) {
			if (other.arrivalYear != null)
				return false;
		} else if (!arrivalYear.equals(other.arrivalYear))
			return false;
		if (departureDay == null) {
			if (other.departureDay != null)
				return false;
		} else if (!departureDay.equals(other.departureDay))
			return false;
		if (departureLocation == null) {
			if (other.departureLocation != null)
				return false;
		} else if (!departureLocation.equals(other.departureLocation))
			return false;
		if (departureMonth == null) {
			if (other.departureMonth != null)
				return false;
		} else if (!departureMonth.equals(other.departureMonth))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (departureYear == null) {
			if (other.departureYear != null)
				return false;
		} else if (!departureYear.equals(other.departureYear))
			return false;
		if (numPassengers == null) {
			if (other.numPassengers != null)
				return false;
		} else if (!numPassengers.equals(other.numPassengers))
			return false;
		if (oneWayTrip == null) {
			if (other.oneWayTrip != null)
				return false;
		} else if (!oneWayTrip.equals(other.oneWayTrip))
			return false;
		if (roundTrip == null) {
			if (other.roundTrip != null)
				return false;
		} else if (!roundTrip.equals(other.roundTrip))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "TravelItinerary [numPassengers=" + numPassengers + ", oneWayTrip=" + oneWayTrip + ", roundTrip="
				+ roundTrip + ", departureLocation=" + departureLocation + ", departureMonth=" + departureMonth
				+ ", departureDay=" + departureDay + ", departureYear=" + departureYear + ", departureTime="
				+ departureTime + ", arrivalLocation=" + arrivalLocation + ", arrivalMonth=" + arrivalMonth
				+ ", arrivalDay=" + arrivalDay + ", arrivalYear=" + arrivalYear + ", arrivalTime=" + arrivalTime + "]";
	}
	
	
	
	
	
	
}
