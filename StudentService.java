package com.gl.studentRegistration.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.studentRegistration.entity.Student;

@Service
public interface StudentService {
	Student findById(Long id);

	Student saveStudent(Student student);

	Student updateStudent(Student student, Long id);

	void deleteStudent(Long id) throws Exception;

	List<Student> findAllStudents();
}