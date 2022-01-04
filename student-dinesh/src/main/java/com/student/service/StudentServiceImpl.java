package com.student.service;

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

}