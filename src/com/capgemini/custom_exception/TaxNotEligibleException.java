package com.capgemini.custom_exception;

public class TaxNotEligibleException extends Exception{
	
	public TaxNotEligibleException(String message) {
		super(message);
	}

}
