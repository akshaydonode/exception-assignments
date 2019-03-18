package com.capgemini.mydate.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import com.capgemini.custom_exception.InvalidDayException;
import com.capgemini.custom_exception.InvalidMonthException;
import com.capgemini.mydate.model.MyDate;

public class MyDateTest {

	

	@Test
	public void testObjectIsCreatedWithDefaultConstructor() {
		MyDate mydate = new MyDate();
		assertNotNull(mydate);
	}

	@Test
	public void testObjectIsCreatedWithParameterizedConstructor() {
		MyDate mydate = new MyDate(12,8,2019);
		assertNotNull(mydate);
	}

	@Test
	public void testWhetherDateIsValid() throws InvalidDayException, InvalidMonthException {
		MyDate mydate = new MyDate(12,8,2019);
		String expected = "Valid Date";
		assertEquals(expected, mydate.checkDateIsValidOrNot());

	}
	
	@Test(expected=InvalidDayException.class)
	public void testWhetherDateIsInValid() throws InvalidDayException, InvalidMonthException {
		MyDate mydate = new MyDate(33,2,2019);
		
		 mydate.checkDateIsValidOrNot();

	}
	
	@Test
	public void testWhetherMonthIsValid() throws InvalidDayException, InvalidMonthException {
		MyDate mydate = new MyDate(12,8,2019);
		String expected = "Valid Date";
		assertEquals(expected, mydate.checkDateIsValidOrNot());

	}
	
	@Test(expected=InvalidMonthException.class)
	public void testWhetherMonthIsInValid() throws InvalidDayException, InvalidMonthException {
		MyDate mydate = new MyDate(30,22,2019);
	
		 mydate.checkDateIsValidOrNot();

	}
}
