package com.abhishek.student.exception;

public class StudentNotFoundException extends RuntimeException {

	public StudentNotFoundException(Long Id){
		super(String.format("Student with Id %d not found", Id));
	}
	
}
