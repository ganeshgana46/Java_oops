package com.dl.one;

public class Student {
	
	//Private members
	private String studentName;
	private String studentEmail;
	private int studentId;
	private long studentContact;
	
	//constructor
	public Student(String studentName, String studentEmail, int studentId, long studentContact) {
		super();
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentId = studentId;
		this.studentContact = studentContact;
	}
	//code wrap
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public long getStudentContact() {
		return studentContact;
	}
	public void setStudentContact(long studentContact) {
		this.studentContact = studentContact;
	}
	
	public String toString() {
		return String.format("Student Name : %s\nStudent Email : %s\nStudent Id : %d\nStudent Contact : %d",studentName,
				studentEmail,studentId,studentContact);
	}

}
