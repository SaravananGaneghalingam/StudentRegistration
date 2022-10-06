package com.Student.entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "STUDENT")
public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentID;
	private String firstName;
	private String lastName;
	private String age;
	private String grade;
	private String mobileNumber;
	private String gender;
	private String address;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "studentID", nullable = false, unique = true)
	private Student stu;
	
	// TODO: Generate Getters and Setters...

	public Student() {

	}

	public Student(String firstName, String lastName, String age,String grade, String mobileNumber, String gender, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.grade = grade;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.address = address;
	}

	public Long getId() {
		return studentID;
	}

	public void setId(Long studentID) {
		this.studentID = studentID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Long getStudentID() {
		return studentID;
	}

	public void setStudentID(Long studentID) {
		this.studentID = studentID;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student getStudent() {
		return stu;
	}

	public void setStudent(Student stu) {
		this.stu = stu;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+", grade=" + grade + ", mobileNumber=" + mobileNumber + ", gender="
						+ gender + ", address=" + address + ", stu=" + stu + "]";
	}

	
	

}
