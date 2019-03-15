package com.capgemini.factorial.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.custom_exception.FactorialException;
import com.capgemini.custom_exception.InvalidInputException;
import com.capgemini.factorial.model.Factorial;

public class FacorialTest {
	
	private Factorial factorial;

	@Before
	public void setUp() throws Exception {
		factorial = new Factorial(1);
	}

	@Test
	public void testCheckFactorialResult() throws InvalidInputException, FactorialException {

		Factorial factorial = new Factorial(5);
		assertEquals(120, factorial.getFactorial());
	}
	@Test(expected=InvalidInputException.class)
	public void testInputIsLessThanTwo() throws InvalidInputException, FactorialException {

		
		factorial.getFactorial();
		 
	}

	@Test(expected=FactorialException.class)
	public void testFactorialIntHighestValue() throws FactorialException, InvalidInputException{
		factorial = new Factorial(2252);
		factorial.getFactorial();
	}
}
