package com.Student.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Student.entities.Student;


public interface StudentRepositories extends JpaRepository<Student, Long>{

}
