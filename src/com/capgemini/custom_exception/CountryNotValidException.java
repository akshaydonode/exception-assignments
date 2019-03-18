package com.capgemini.custom_exception;

public class CountryNotValidException extends Exception{

	public CountryNotValidException(String message) {
		super(message);
	}
}
