package com.student.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class StudentExceptionHandler {

	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ExceptionResponse> handleStudentNotFoundException(StudentNotFoundException ex,
			WebRequest request) {
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setDate(LocalDateTime.now());
		exceptionResponse.setDescription("Data not found");
		exceptionResponse.setStatusCode("12ABC");
		exceptionResponse.setMessage(ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exceptionResponse);
	}
}
