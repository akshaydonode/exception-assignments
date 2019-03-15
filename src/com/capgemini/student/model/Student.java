package com.capgemini.student.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.naming.NameNotFoundException;

import com.capgemini.custom_exception.AgeNotWithinRangeException;

public class Student {
	
	private int studentRollNO;
	private String studentName;
	private int studentAge;
	private String studentCourse;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentRollNO, String studentName, int studentAge, String studentCourse) {
	
		this.studentRollNO = studentRollNO;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentCourse = studentCourse;
	}

	public boolean checkAgeIsValidOrNot() throws AgeNotWithinRangeException{
		if(studentAge >= 15 && studentAge <= 21)
			return true;
		else
			throw new AgeNotWithinRangeException("Age Is Not Valid");
		
	}

	public void checkValidationOfName() throws NameNotFoundException {
		
		Pattern pattern = Pattern.compile("[a-zA-Z]");
		Matcher matcher = pattern.matcher(studentName);
		
		if(!(matcher.matches()))
					throw new NameNotFoundException("Name contains number or special character");
		
		
		// TODO Auto-generated method stub
		
	}
	
	
	

}
