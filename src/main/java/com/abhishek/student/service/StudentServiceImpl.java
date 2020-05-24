/**
 * 
 */
package com.abhishek.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhishek.student.model.Student;
import com.abhishek.student.repository.StudentRepository;

/**
 * @author Abhishek Thakur
 *
 */
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	List<Student> studentList = new ArrayList<>();
	public StudentServiceImpl(){
		studentList.add(new Student(Long.valueOf("1001"), "Shaswat", "Oracle"));		
		studentList.add(new Student(Long.valueOf("1002"), "Ashutosh", "Spring Boot"));
		studentList.add(new Student(Long.valueOf("1003"), "Abhishek", "Hibernate and JPA"));
		
	}
	@Override
	public Iterable<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}
	
	@Override
	public Optional<Student> getStudentById(Long Id) {
		return studentRepository.findById(Id);		
	}
	
	@Override
	public void saveStudent(Student student) {		
		studentRepository.save(student);
	}
	
	@Override
	public void updateStudent(Student student) {		
		studentRepository.save(student);
	}
	
	@Override
	public void deleteStudent(Long Id) {		
		studentRepository.deleteById(Id);
	}

	
}
