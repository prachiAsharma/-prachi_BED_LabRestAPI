package com.gl.studentRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.studentRegistration.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
