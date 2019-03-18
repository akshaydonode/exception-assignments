package com.capgemini.student.test;

import static org.junit.Assert.*;

import javax.naming.NameNotFoundException;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.custom_exception.AgeNotWithinRangeException;
import com.capgemini.custom_exception.NameNotValidException;
import com.capgemini.student.model.Student;

public class StudentTest {

	/*
	 * private Student student;
	 * 
	 * @Before public void setUp() throws NameNotValidException,
	 * AgeNotWithinRangeException { student= new Student(11,"AMD",21,"BE"); }
	 */

	@Test
	public void testObjectIsCreatedWithDefaultConstructor() {
		Student student= new Student();
		assertNotNull(student);
	}
	
	
	 @Test 
	 public void testObjectIsCreatedWithParameterizedConstructor() throws NameNotValidException, AgeNotWithinRangeException {
		 Student  student= new Student(11,"AMD",21,"BE");
	  assertNotNull(student); }
	  
	  @Test 
	  public void testWhereAgeIsValid() throws AgeNotWithinRangeException, NameNotValidException { 
		 Student student= new Student(11,"AMD",21,"BE");
	 
	  student.getStudentAge(); 
	  }
	  
	  @Test(expected=AgeNotWithinRangeException.class) 
	  public void testWhereAgeIsInValid() throws AgeNotWithinRangeException, NameNotValidException { 
		 Student student= new Student(11,"AMD",12,"BE");
	  
	  //student.checkAgeIsValidOrNot();
		  }
	  
	  @Test(expected=NameNotValidException.class) 
	  public void testWhetherNameContainNumber() throws NameNotValidException, AgeNotWithinRangeException { 
		Student  student= new Student(11,"AMD9763",20,"BE");
	  }
	  //student.checkValidationOfName(); }
	  
	  @Test(expected=NameNotValidException.class) 
	  public void testWhetherNameContainSpecialCharacter() throws NameNotValidException, AgeNotWithinRangeException {
		 Student student= new Student(11,"@$AMD#",20,"BE");
	  //student.checkValidationOfName(); 
	  }
	 
}
