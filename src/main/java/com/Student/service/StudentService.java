package com.Student.service;

import com.Student.entities.Student;

public interface StudentService {
	StudentDto getStudentByStudentID(Long studentID);
	void saveStudent(Student stu);
	void deleteStudentById(Long studentID);
	void updateStudent(Long studentID, Student stu);
}
