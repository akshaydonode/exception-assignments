package com.capgemini.mydate.model;

import com.capgemini.custom_exception.InvalidDayException;
import com.capgemini.custom_exception.InvalidMonthException;

public class MyDate {

	private int day;
	private int month;
	private int year;
	public MyDate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String checkDateIsValidOrNot() throws InvalidDayException, InvalidMonthException {
		if(checkYear().equals("true"))
		{
			if(month <= 12)
			{
				if(month == 2 && day > 29)
				{
					throw new InvalidDayException("Invalid day");
				}
			 	if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||month == 10 || month == 12) && month > 31)
				{
			 		throw new InvalidDayException("Invalid day");
				}
				if((month == 4 || month == 6 ||month == 9 || month == 11) && month > 30)
				{
					throw new InvalidDayException("Invalid day");
				}
			}
			else{
				throw new InvalidMonthException("Invalid Month");
			}	
		}
		else if(month <= 12)
		{
			if(month == 2 && day > 28)
			{
				throw new InvalidDayException("Invalid day");
			}
				
			if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||month == 10 || month == 12) && month > 31)
			{
				throw new InvalidDayException("Invalid day");
			}
			if((month == 4 || month == 6 || month == 9 || month == 11) && month > 30)
			{
				throw new InvalidDayException("Invalid day");
			}
		
		}else {
			throw new InvalidMonthException("Invalid Month");
		}
			
		
		return "Valid Date";
	}

	public String checkYear()
	{
		if(year % 4 == 0)
		{
			if(year % 100 == 0 && year % 400 == 0)
			{
				return "true";
			}
		return "true";

		}
		else{
			return "false";
		}
	
	}

	
	
}
