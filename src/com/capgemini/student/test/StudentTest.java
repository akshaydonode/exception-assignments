package com.capgemini.student.test;

import static org.junit.jupiter.api.Assertions.*;

import javax.naming.NameNotFoundException;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.custom_exception.AgeNotWithinRangeException;
import com.capgemini.custom_exception.NameNotValidException;
import com.capgemini.student.model.Student;

public class StudentTest {

	private Student student;
	
	@Before
	public void setUp() throws Exception {
		student= new Student(11,"AMD",21,"BE");
	}

	@Test
	public void testObjectIsCreatedWithDefaultConstructor() {
		student= new Student();
		assertNotNull(student);
	}
	
	@Test
	public void testObjectIsCreatedWithParameterizedConstructor() {
	
		assertNotNull(student);
	}

	@Test
	public void testWhereAgeIsValid() throws AgeNotWithinRangeException {
		assertEquals(true, student.checkAgeIsValidOrNot());
	}
	
	@Test(expected=AgeNotWithinRangeException.class)
	public void testWhereAgeIsInValid() throws AgeNotWithinRangeException {
		student= new Student(11,"AMD",12,"BE");
		 student.checkAgeIsValidOrNot();
	}
	@Test(expected=NameNotValidException.class)
	public void testWhetherNameContainNumber() throws NameNotFoundException {
		student= new Student(11,"AMD9763",12,"BE");
		student.checkValidationOfName();
	}
}
