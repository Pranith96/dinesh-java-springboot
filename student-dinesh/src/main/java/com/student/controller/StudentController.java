package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("/save")
	public ResponseEntity<String> createStudent(@RequestBody Student student) {
		String response = studentService.addStudent(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping("/id/{studentId}")
	public ResponseEntity<Student> getStudent(@PathVariable("studentId") Integer studentId) {
		Student response = studentService.getStudent(studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/name/{studentName}")
	public ResponseEntity<List<Student>> getStudentName(@PathVariable("studentName") String studentName) {
		List<Student> response = studentService.getStudentName(studentName);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/studentId")
	public ResponseEntity<Student> getStudentByRequesParam(@RequestParam("studentId") Integer studentId) {
		Student response = studentService.getStudent(studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
