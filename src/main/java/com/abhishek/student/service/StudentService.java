package com.abhishek.student.service;

import java.util.Optional;

import com.abhishek.student.model.Student;

public interface StudentService {

	Iterable<Student> getAllStudents();
	
	Optional<Student> getStudentById(Long Id);
	
	void saveStudent(Student student);	
	
	void updateStudent(Student student);
	
	void deleteStudent(Long Id);
}
