package com.greatlearning.studentregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.studentregistration.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
