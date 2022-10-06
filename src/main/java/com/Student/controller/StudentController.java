package com.Student.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Student.Contants;
import com.Student.entities.Student;
import com.Student.service.StudentDto;
import com.Student.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService stuService;
	
	@PostMapping(Contants.STUDENT)
	public ResponseEntity<Object> createIncomingSample(@RequestBody StudentDto stuDto) {
		Student stu = new Student();
		stu.setStudentID(stuDto.getId());
		stu.setFirstName(stuDto.getFirstName());
		stu.setLastName(stuDto.getLastName());
		stu.setAge(stuDto.getAge());
		stu.setGrade(stuDto.getGrade());
		stu.setMobileNumber(stuDto.getMobileNumber());
		stu.setGender(stuDto.getGender());
		stu.setAddress(stuDto.getAddress());
		stuService.saveStudent(stu);
		return ResponseEntity.ok("Saved Successfully!");
	}
	@GetMapping("/getStudent/{studentID}")
	public ResponseEntity<Object> getStudentByStudentID(@PathVariable Long studentID) {

		return ResponseEntity.ok(stuService.getStudentByStudentID(studentID));
	}
	@DeleteMapping("/delStudent/{studentID}")
	public ResponseEntity<Object> deleteStudent(@PathVariable("studentID") Long studentID) {
		stuService.deleteStudentById(studentID);
		return ResponseEntity.ok("Deleted Successfully!");
	}
	@PutMapping("/updStudent/{studentID}")
	public ResponseEntity<Object> updateStudentsData(@RequestBody Student stu, @PathVariable Long studentID ) {
			stuService.updateStudent(studentID, stu);
			return ResponseEntity.ok("Updated Successfully!");
	}

	
	@RequestMapping("/hello")
	public Map<String, String> callAsyncMethod() {
		Map map = new HashMap<Integer, String>();
		map.put("message", "Hello");

		map.put("message1", "Hello-world");
		return map; // returns empty braces
	}
}
