package com.abhishek.student.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<Object> handleStudentNotFoundException(
    		StudentNotFoundException ex, WebRequest request) {

		ErrorMessage errorMessage = new ErrorMessage("Fail","Student not found in DB",LocalDateTime.now());
        
        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
    }

	@ExceptionHandler(NoDataFoundException.class)
    public ResponseEntity<Object> handleStudentNotFoundException(
    		NoDataFoundException ex, WebRequest request) {

		ErrorMessage errorMessage = new ErrorMessage("Fail","No data found in DB",LocalDateTime.now());
        
        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
    }

}
