package com.Student.service;

public class StudentDto {

		private Long studentID;
		private String firstName;
		private String lastName; 
		private String age;
		private String grade;
		private String mobileNumber;
		private String gender;
		private String address;
		
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
		
		
	}



