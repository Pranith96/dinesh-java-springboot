package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {

	String addStudent(Student student);

	Student getStudent(Integer studentId);

	List<Student> getStudentName(String studentName);

	String deleteStudent(Integer studentId);

	String updateStudentName(Integer studentId, String studentName);

}
