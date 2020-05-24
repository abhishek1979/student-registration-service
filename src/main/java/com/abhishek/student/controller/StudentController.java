package com.abhishek.student.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.student.model.Student;
import com.abhishek.student.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/students")
	public ResponseEntity<Iterable<Student>> getStudents() {
		Iterable<Student> studentList = studentService.getAllStudents();	 
	    return new ResponseEntity<Iterable<Student>>(studentList, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable Long id) {
		Optional<Student> student = studentService.getStudentById(id);	 
	    return new ResponseEntity<Student>(student.get(), new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping("/student")
	public ResponseEntity<String> saveStudent(@RequestBody Student student) {
		studentService.saveStudent(student);	 
	    return new ResponseEntity<String>("Student saved successfully.", new HttpHeaders(), HttpStatus.OK);
	}
	
	@PatchMapping("/student")
	public ResponseEntity<String> updateStudent(@RequestBody Student student) {
		studentService.updateStudent(student);	 
	    return new ResponseEntity<String>("Student updated successfully.", new HttpHeaders(), HttpStatus.OK);
	}
	
	@DeleteMapping("/student/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);	 
	    return new ResponseEntity<String>("Student deleted successfully.", new HttpHeaders(), HttpStatus.OK);
	}
}
