package com.Student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Student.entities.Student;
import com.Student.repositories.StudentRepositories;


@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepositories stuRepository;

	
	@Override
	public void saveStudent(Student stu) {
		stuRepository.save(stu);
	}
	@Override
	public void deleteStudentById(Long studentID) {
		stuRepository.deleteById(studentID);
	}
	@Override
	public void updateStudent(Long studentID, Student stu)  {
		stuRepository.save(stu);
	}

	@Override
	public StudentDto getStudentByStudentID(Long studentID) {
		// TODO Auto-generated method stub
		Student stu=stuRepository.findById(studentID).get();
		StudentDto stuDto=new StudentDto();
		stuDto.setId(stu.getStudentID());
		stuDto.setFirstName(stu.getFirstName());
		stuDto.setLastName(stu.getLastName());
		stuDto.setAge(stu.getAge());
		stuDto.setId(stu.getStudentID());
		stuDto.setGrade(stu.getGrade());
		stuDto.setMobileNumber(stu.getMobileNumber());
		stuDto.setGender(stu.getGender());
		stuDto.setAddress(stu.getAddress());
		return stuDto;
	}
	
	
}
