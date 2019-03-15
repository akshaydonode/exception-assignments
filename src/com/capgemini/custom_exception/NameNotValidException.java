package com.capgemini.custom_exception;

public class NameNotValidException extends Exception{

	public NameNotValidException(String message) {
		super(message); 
	}
}
