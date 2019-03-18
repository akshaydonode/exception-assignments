package com.capgemini.taxcalculator.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.capgemini.custom_exception.CountryNotValidException;
import com.capgemini.custom_exception.EmployeeNameInvalidException;
import com.capgemini.custom_exception.TaxNotEligibleException;
import com.capgemini.taxcalculator.model.TaxCalculator;

public class TaxCalculatorTest {


	@Test
	public void testObjectIsCreatedWithDefaultConstructor() {
		TaxCalculator taxcal = new TaxCalculator();
		assertNotNull(taxcal);
	}


	@Test
	public void testObjectIsCreatedWithParameterizedConstructor() {
		TaxCalculator taxcal = new TaxCalculator("AMD",true,17000);
		assertNotNull(taxcal);
	}
	
	
	  @Test(expected=CountryNotValidException.class)
	  public void testCountryNameIsINDIANOrNot() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		  TaxCalculator taxcal = new TaxCalculator("AMD",false,17000); 
		  taxcal.calculateTax(); 
		  }
	 
	
	@Test(expected=EmployeeNameInvalidException.class)
	public void testEmployeeNameWhetherItIsNull() throws EmployeeNameInvalidException, CountryNotValidException, TaxNotEligibleException {
		TaxCalculator taxcal = new TaxCalculator("",true,17000);
			taxcal.calculateTax();
	}
}
