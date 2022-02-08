package com.student.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.exception.StudentNotFoundException;
import com.student.repository.StudentRepository;

@Service
@Transactional
@Profile(value = {"local", "dev", "prod"})
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public String addStudent(Student student) {
		student.getAddress().setStudent(student);
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
			throw new StudentNotFoundException("Student details not exists");
		}
		return response.get();
	}

	@Override
	public List<Student> getStudentName(String studentName) {
		Optional<List<Student>> response = studentRepository.findByStudentName(studentName);
		if (!response.isPresent()) {
			throw new StudentNotFoundException("Student Details not exists");
		}
		return response.get();
	}

	@Override
	public String deleteStudent(Integer studentId) {
		Optional<Student> response = studentRepository.findById(studentId);
		if (!response.isPresent()) {
			throw new RuntimeException("Data not exists");
		}
		studentRepository.deleteById(studentId);
		return "Deleted Succesfully";
	}

	@Override
	public String updateStudentName(Integer studentId, String studentName) {
		studentRepository.updateStudentNameById(studentId, studentName);
		return "updated successfully";
	}

}
