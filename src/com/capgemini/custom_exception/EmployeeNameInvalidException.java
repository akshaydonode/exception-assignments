package com.capgemini.custom_exception;

public class EmployeeNameInvalidException extends Exception{
	public EmployeeNameInvalidException(String message) {
		super(message);
	}

}
