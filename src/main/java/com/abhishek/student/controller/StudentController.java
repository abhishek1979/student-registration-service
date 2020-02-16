package com.abhishek.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.student.model.Student;
import com.abhishek.student.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/all")
	public ResponseEntity<Iterable<Student>> getAllStudents() {
		Iterable<Student> studentList = studentService.getAllStudents();	 
	    return new ResponseEntity<Iterable<Student>>(studentList, new HttpHeaders(), HttpStatus.OK);
	}
}
