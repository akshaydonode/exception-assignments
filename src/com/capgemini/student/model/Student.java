package com.capgemini.student.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.custom_exception.AgeNotWithinRangeException;
import com.capgemini.custom_exception.NameNotValidException;

public class Student {
	Pattern pattern = Pattern.compile("^[\\p{L} .'-]+$", Pattern.CASE_INSENSITIVE);
	private int studentRollNO;
	private String studentName;
	private int studentAge;
	private String studentCourse;
	
	public Student() {
		
		// TODO Auto-generated constructor stub
	}

	public Student(int studentRollNO, String studentName, int studentAge, String studentCourse) throws NameNotValidException, AgeNotWithinRangeException {
	
		this.studentRollNO = studentRollNO;
		if(checkValidationOfName(studentName))
			this.studentName = studentName;
		if(checkAgeIsValidOrNot(studentAge));
			this.studentAge = studentAge;
		this.studentCourse = studentCourse;
	}

	
	public int getStudentRollNO() {
		return studentRollNO;
	}

	public void setStudentRollNO(int studentRollNO) {
		this.studentRollNO = studentRollNO;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public boolean checkAgeIsValidOrNot(int studentAge) throws AgeNotWithinRangeException{
		if(studentAge >= 15 && studentAge <= 21)
			return true;
		else
			throw new AgeNotWithinRangeException("Age Is Not Valid");
		
	}

	public boolean checkValidationOfName(String studentName) throws NameNotValidException {
		
		
		Matcher matcher = pattern.matcher(studentName);
		if(!(matcher.matches()))
		{
			throw new NameNotValidException("Name contains number or special character");
		}
					
		
		return  true;
		// TODO Auto-generated method stub
		
	}
	
	
	

}
