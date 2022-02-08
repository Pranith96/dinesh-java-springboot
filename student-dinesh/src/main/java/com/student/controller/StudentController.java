package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.dto.StudentDto;
import com.student.entity.Student;
import com.student.service.StudentService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("/save")
	@ApiOperation(value = "Student account Creation API", notes = "Please provide all the info for Student account creation", response = Student.class)
	public ResponseEntity<String> createStudent(@RequestBody Student student) {
		String response = studentService.addStudent(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping("/id/{studentId}")
	@ApiOperation(value = "Student Details fetch API", notes = "Please provide all the info for Student Details fetch", response = Student.class)
	public ResponseEntity<StudentDto> getStudent(@PathVariable("studentId") Integer studentId) {
		Student response = studentService.getStudent(studentId);
		StudentDto studentDto = new StudentDto();
		studentDto.setStudentName(response.getStudentName());
		studentDto.setEmail(response.getEmail());
		studentDto.setLoginId(response.getLoginId());
		studentDto.setMobileNumber(response.getMobileNumber());
		return ResponseEntity.status(HttpStatus.OK).body(studentDto);
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

	@DeleteMapping("/delete/{studentId}")
	@ApiOperation(value = "Student Details Delete API", notes = "Please provide all the info for Student Details Delete", response = Student.class)
	public ResponseEntity<String> deleteStudent(@PathVariable("studentId") Integer studentId) {
		String response = studentService.deleteStudent(studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@PutMapping("/update/{studentId}/{studentName}")
	public ResponseEntity<String> updateStudentName(@PathVariable("studentId") Integer studentId,
			@PathVariable("studentName") String studentName) {
		String response = studentService.updateStudentName(studentId, studentName);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
