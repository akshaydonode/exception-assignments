package com.capgemini.factorial.model;

import com.capgemini.custom_exception.FactorialException;
import com.capgemini.custom_exception.InvalidInputException;

public class Factorial {

	private int number;
	private long result = 1;
	
	public Factorial(int i) {
		this.number=i;
	}
	
	public long getFactorial() throws InvalidInputException, FactorialException {
		
			if(number < 2)
			{
				throw new InvalidInputException("Input is less than 2");
			}	
				
			for(int i = 1; i<=number;i++ )	{
					result =  result * i;
					
					if(result > Integer.MAX_VALUE)
						throw new FactorialException("Your factorial result is exceed");
				}
			

			
			
			return result;


	}
	
}