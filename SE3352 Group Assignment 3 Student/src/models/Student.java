package models;

import views.OneStudentView;

public class Student {	
	private String studentID;
	private String password;
	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void attach(OneStudentView oneStudentView) {		
		
	}
}
