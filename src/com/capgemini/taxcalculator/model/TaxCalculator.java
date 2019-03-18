package com.capgemini.taxcalculator.model;

import com.capgemini.custom_exception.CountryNotValidException;
import com.capgemini.custom_exception.EmployeeNameInvalidException;
import com.capgemini.custom_exception.TaxNotEligibleException;

public class TaxCalculator {
	
	private String employeeName;
	private boolean employeeIsIndian;
	private double employeeSalary;
	
	
	public TaxCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TaxCalculator(String employeeName, boolean employeeIsIndian, double employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeIsIndian = employeeIsIndian;
		this.employeeSalary = employeeSalary;
	}


	public double calculateTax() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		// TODO Auto-generated method stub
		
		if(employeeIsIndian == false)
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		
		if(employeeName == null || employeeName == "")
			throw new EmployeeNameInvalidException("“The employee name cannot be empty");
	
		if(employeeSalary > 100000)
			return employeeSalary * 8/100;
		if(employeeSalary > 50000)
			return employeeSalary * 6/100;
		if(employeeSalary > 30000)
			return employeeSalary * 5/100;
		if(employeeSalary > 10000)
			return employeeSalary *4/100;
		
		throw new TaxNotEligibleException("The employee does not need to pay tax"); 
		
	}
	
	

}
