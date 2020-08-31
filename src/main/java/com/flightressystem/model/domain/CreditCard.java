package com.flightressystem.model.domain;

import java.io.Serializable;

/**
 * @author Tasha Wheatley
 * @since 3/21/20
 */

public class CreditCard implements Serializable {
	
	/*Domain CreditCard class that holds all information about the customer's credit card
	 * including the credit card type, number, and expiration date
	 */

	private static final long serialVersionUID = 1L; //Universal version identifier for a Serializable class.
	
	private String creditCardType;  //Customer credit card type (Ex: visa, mastercard, etc.)
	
	private String creditCardNum;     //Customer credit card number
	
	private String creditCardExp; 	 //Customer credit card expiration date
	
	public boolean validate() {
		if (creditCardType == null)
			return false;
		if (creditCardNum == null)
			return false;
		if (creditCardExp == null)
			return false;

		return true;
	}
	
	
	public CreditCard() {
		super();
	}

	
	/**
	 * @return the creditCardType
	 */
	public String getCreditCardType() {
		return creditCardType;
	}

	/**
	 * @param creditCardType the creditCardType to set
	 */
	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}

	/**
	 * @return the creditCardNum
	 */
	public String getCreditCardNum() {
		return creditCardNum;
	}

	/**
	 * @param creditCardNum the creditCardNum to set
	 */
	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNum = creditCardNum;
	}

	/**
	 * @return the creditCardExp
	 */
	public String getCreditCardExp() {
		return creditCardExp;
	}

	/**
	 * @param creditCardExp the creditCardExp to set
	 */
	public void setCreditCardExp(String creditCardExp) {
		this.creditCardExp = creditCardExp;
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
		result = prime * result + ((creditCardExp == null) ? 0 : creditCardExp.hashCode());
		result = prime * result + ((creditCardNum == null) ? 0 : creditCardNum.hashCode());
		result = prime * result + ((creditCardType == null) ? 0 : creditCardType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof CreditCard))
			return false;
		CreditCard other = (CreditCard) obj;
		if (creditCardExp == null) {
			if (other.creditCardExp != null)
				return false;
		} else if (!creditCardExp.equals(other.creditCardExp))
			return false;
		if (creditCardNum == null) {
			if (other.creditCardNum != null)
				return false;
		} else if (!creditCardNum.equals(other.creditCardNum))
			return false;
		if (creditCardType == null) {
			if (other.creditCardType != null)
				return false;
		} else if (!creditCardType.equals(other.creditCardType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CreditCard [creditCardType=" + creditCardType + ", creditCardNum=" + creditCardNum + ", creditCardExp="
				+ creditCardExp + "]";
	}

	
}
