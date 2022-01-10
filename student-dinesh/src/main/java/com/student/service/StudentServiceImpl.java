package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public String addStudent(Student student) {
		Student response = studentRepository.save(student);
		if (response == null) {
			return "data not saved";
		}
		return "data saved successfully";
	}

	@Override
	public Student getStudent(Integer studentId) {
		Optional<Student> response = studentRepository.findById(studentId);
		if (!response.isPresent()) {
			throw new RuntimeException("Data not exists");
		}
		return response.get();
	}

	@Override
	public List<Student> getStudentName(String studentName) {
		Optional<List<Student>> response = studentRepository.findByStudentName(studentName);
		if (!response.isPresent()) {
			throw new RuntimeException("Data not exists");
		}
		return response.get();
	}

}
