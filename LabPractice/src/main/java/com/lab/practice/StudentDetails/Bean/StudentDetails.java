package com.lab.practice.StudentDetails.Bean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class StudentDetails 
{
	@Id	
	   @Column(name="StudentId")
	   int StudentId;
	   @Column(name="StudentName")
	   String StudentName;
	   @Column(name="University")
	   String University;
	   @Column(name="email")
	   String email;
	

	public StudentDetails() {}
	public StudentDetails(int StudentId, String StudentName, String University, String email) {
		super();
		this.StudentId = StudentId;
		this.StudentName = StudentName;
		this.University = University;
		this.email = email;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int StudentId) {
		this.StudentId = StudentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setstudentName(String StudentName) {
		this.StudentName = StudentName;
	}
	public String University() {
		return University;
	}
	public void setUniversity(String University) {
		this.University = University;
	}
	public String email() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	

}
